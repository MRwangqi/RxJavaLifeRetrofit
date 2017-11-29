package com.codelang.retrofitrx;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.codelang.retrofitrx.api.NetUtils;
import com.codelang.retrofitrx.app.MyApplication;
import com.codelang.retrofitrx.photos.ImageSelector;
import com.codelang.retrofitrx.rxJava.exception.ApiException;
import com.codelang.retrofitrx.rxJava.model.Student;
import com.codelang.retrofitrx.rxJava.observer.HttpRxObservable;
import com.codelang.retrofitrx.rxJava.observer.HttpRxObserver;
import com.codelang.retrofitrx.test.OutterClass;
import com.codelang.retrofitrx.test.TestActivity;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.yuyh.library.imgsel.ISNav;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.reactivex.disposables.Disposable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * @author wangqi
 * @since 2017/11/24 上午11:45
 * http://www.jianshu.com/p/3e13e5d34531  缓存
 */

public class MainActivity extends TestActivity {

    private static final int REQUEST_CAMERA_CODE = 0x01;
    ImageView imgPhoto;
    String path;

    List<String> list = new ArrayList<>();

    public static MainActivity instans;

    // 静态的内部类
    private static OutterClass.Inner innerClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPhoto = findViewById(R.id.main_photo);

        instans = this;


        /**
         * 测试内存泄漏
         */
        OutterClass outterClass = new OutterClass();
        innerClass = outterClass.new Inner();
//        MyApplication.getRefWatcher(this).watch(innerClass);


    }


    /**
     * 上传头和普通文本
     *
     * @param v
     */
    public void submit(View v) {
        NetUtils.getStringRetrofit()
                .test("aaa", "zhangsan")
                .enqueue(new retrofit2.Callback<ResponseBody>() {
                    @Override
                    public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                        Log.i("response", response.message());
                    }

                    @Override
                    public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

                    }
                });
    }

    /**
     * 单上传文件和内容
     */

    public void uoImg(View v) {

        File file = new File(path);
        RequestBody photoRequestBody = RequestBody.create(MediaType.parse("image/png"), file);
        MultipartBody.Part photo = MultipartBody.Part.createFormData("image", file.getName(), photoRequestBody);

        NetUtils.getStringRetrofit()
                .upload("aaa", "zhangsan", photo)
                .enqueue(new retrofit2.Callback<ResponseBody>() {
                    @Override
                    public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                        Log.i("response", response.message());
                    }

                    @Override
                    public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

                    }
                });
    }

    /**
     * 多文件上传
     */

    public void mutilImg(View v) {

        HashMap<String, RequestBody> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            File file = new File(list.get(i));
            RequestBody requestFile =
                    RequestBody.create(MediaType.parse("application/otcet-stream"), file);
            map.put("image" + i, requestFile);
        }
        NetUtils.getStringRetrofit()
                .uploadMuiti(map)
                .enqueue(new retrofit2.Callback<ResponseBody>() {
                    @Override
                    public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                        Log.i("response", response.message());
                    }

                    @Override
                    public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

                    }
                });
    }


    /**
     * rxJava上传
     */


    public void rxJava(View v) {


        HttpRxObserver httpRxObserver = new HttpRxObserver<Student>("rxJava") {
            @Override
            protected void onStart(Disposable d) {
                Toast.makeText(MainActivity.this, "start", Toast.LENGTH_SHORT).show();
            }

            @Override
            protected void onError(ApiException e) {
                Log.i("tag", "onError-----" + e.getMsg());

                Toast.makeText(MainActivity.this, e.getMsg(), Toast.LENGTH_SHORT).show();
            }

            @Override
            protected void onSuccess(Student response) {
                Log.i("tag", "onSuccess-----" + response.toString());

                Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
            }
        };


        HttpRxObservable.getObservable(
                NetUtils.getGsonRetrofit().rxJavaJson(),
                this,
                ActivityEvent.PAUSE).subscribe(httpRxObserver);


//        NetUtils.getGsonRetrofit().rxJavaJson()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<HttpResponse>() {
//                    @Override
//                    public void accept(@NonNull HttpResponse httpResponse) throws Exception {
//                        Toast.makeText(MainActivity.this, httpResponse.toString(), Toast.LENGTH_SHORT).show();
//
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        Toast.makeText(MainActivity.this, throwable.toString(), Toast.LENGTH_SHORT).show();
//                    }
//                });
    }


    /**
     * 获取图片
     *
     * @param v
     */
    public void getImg(View v) {
        ISNav.getInstance().toListActivity(MainActivity.this, ImageSelector.getMultiConfig(), REQUEST_CAMERA_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) return;

        if (requestCode == REQUEST_CAMERA_CODE) {
            List<String> pathList = data.getStringArrayListExtra("result");
            list.clear();
            list.addAll(pathList);
            Toast.makeText(this, list.toString(), Toast.LENGTH_SHORT).show();
            path = pathList.get(0);
            Glide.with(this).load(path).into(imgPhoto);
        }
    }
}

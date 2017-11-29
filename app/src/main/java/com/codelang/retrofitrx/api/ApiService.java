package com.codelang.retrofitrx.api;

import com.codelang.retrofitrx.rxJava.model.HttpResponse;
import com.codelang.retrofitrx.rxJava.model.Student;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * @author wangqi
 * @since 2017/11/24 12:21
 */

public interface ApiService {

    String LOCALHOST = " http://115.159.67.77/";

    // @Part MultipartBody.Part photo
//    @Multipart
//    @POST("file.php")
//    Call<ResponseBody> Login(@Header("token") String token, @Part("name") RequestBody mobile, @Part("password") RequestBody password);

    @Multipart
    @POST("file.php")
    Call<ResponseBody> test(@Header("token") String token, @Part("name") String name);


    /**
     * 单图
     *
     * @param token
     * @param name
     * @param photo
     * @return
     */
    @Multipart
    @POST("file.php")
    Call<ResponseBody> upload(@Header("token") String token, @Part("name") String name, @Part MultipartBody.Part photo);


    /**
     * 多图
     *
     * @param maps
     * @return
     */
    @Multipart
    @POST("file.php")
    Call<ResponseBody> uploadMuiti(@PartMap() Map<String, RequestBody> maps);


    @Multipart
    @POST("file.php")
    Observable<HttpResponse> rxJavaMuiti(@Part("name") String name);


    @GET("json.php")
    Observable<Student> rxJavaJson();


//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId);

//    @POST("login")
//    @FormUrlEncoded
//    Call<User> login(@Field("username") String username, @Field("password") String password);
}
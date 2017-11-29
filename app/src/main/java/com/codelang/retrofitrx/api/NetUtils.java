package com.codelang.retrofitrx.api;

import com.codelang.retrofitrx.rxJava.gson.ResponseConverterFactory;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @author wangqi
 * @since 2017/11/24 13:32
 */

public class NetUtils {
    public static ApiService getGsonRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ApiService.LOCALHOST)
                .client(getHttpClient())
                .addConverterFactory(ResponseConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiService.class);
    }


    private static OkHttpClient getHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build();
    }


    public static ApiService getStringRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ApiService.LOCALHOST)
                .client(getHttpClient())
                .addConverterFactory(ScalarsConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiService.class);
    }

    public static ApiService getRxJavaRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ApiService.LOCALHOST)
                .client(getHttpClient())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiService.class);
    }

}

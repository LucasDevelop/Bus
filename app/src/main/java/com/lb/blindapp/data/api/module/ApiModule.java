package com.lb.blindapp.data.api.module;

import com.google.gson.Gson;
import com.lb.blindapp.data.api.ApiService;
import com.lb.blindapp.utils.Constans;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author：lucas on 2016/8/18 15:32
 * Email：lucas_developer@163.com
 * Description：提供网络工具
 */
@Module
public class ApiModule {

    @Provides
    public OkHttpClient provideClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(Constans.TIMEOUT, TimeUnit.MILLISECONDS)
                .writeTimeout(Constans.TIMEOUT,TimeUnit.MILLISECONDS)
                .readTimeout(Constans.TIMEOUT,TimeUnit.MILLISECONDS)
                .build();
    }

    @Provides
    public Retrofit provideRetrofit(OkHttpClient client, Gson gson){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .baseUrl(Constans.BASE_URL)
                .build();
    }

    @Provides
    public ApiService provideApiService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }
}

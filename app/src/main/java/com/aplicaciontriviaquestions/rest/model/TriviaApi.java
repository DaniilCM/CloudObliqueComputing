package com.aplicaciontriviaquestions.rest.model;

import com.aplicaciontriviaquestions.rest.AplicacionTriviaQuestionsApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class TriviaApi {
    private static Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://the-trivia-api.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

    private static AplicacionTriviaQuestionsApi service;

    public static AplicacionTriviaQuestionsApi getInstance(){
        if(service == null){
            service = retrofit.create(AplicacionTriviaQuestionsApi.class);
        }
        return service;
    }
}

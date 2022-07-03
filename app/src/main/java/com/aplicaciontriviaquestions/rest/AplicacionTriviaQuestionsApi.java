package com.aplicaciontriviaquestions.rest;

import com.aplicaciontriviaquestions.rest.model.modelCategories.Categories;
import com.aplicaciontriviaquestions.rest.model.modelMetadata.Metadata;
import com.aplicaciontriviaquestions.rest.model.modelTrivia.modeloTrivia;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AplicacionTriviaQuestionsApi {
    @GET("api/questions?limit=20")
    Observable<List<modeloTrivia>> listTrivia();

    @GET("api/categories")
    Observable<Categories> listCategories();

    @GET("api/metadata")
    Observable<Metadata> listMetadata();
}

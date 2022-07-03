package com.aplicaciontriviaquestions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.aplicaciontriviaquestions.adapters.RecyclerAdapter;
import com.aplicaciontriviaquestions.rest.model.TriviaApi;
import com.aplicaciontriviaquestions.rest.model.modelCategories.Categories;
import com.aplicaciontriviaquestions.rest.model.modelTrivia.modeloTrivia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    private List<modeloTrivia> datos = new ArrayList<>();
    private RecyclerAdapter adapter;
    Toolbar toolbar;
    RecyclerView recyclerview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView lista = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new RecyclerAdapter(datos);
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setAdapter(adapter);

        toolbar = findViewById(R.id.toolbar);
        recyclerview = findViewById(R.id.recyclerview);

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



        // https://the-trivia-api.com/api/questions?limit=20

        /* //Sin RXJava
        TriviaApi.getInstance().listTrivia().enqueue(new Callback<List<modeloTrivia>>() {
            @Override
            public void onResponse(Call<List<modeloTrivia>> call, Response<List<modeloTrivia>> response) {
                List<modeloTrivia> result = response.body();

                for (modeloTrivia i : result) {
                    Log.e("LogListTrivia", i.getCategory());
                }
            }

            @Override
            public void onFailure(Call<List<modeloTrivia>> call, Throwable t) {

            }
        });
        */


        //Con RXJava
        TriviaApi.getInstance()
                .listTrivia()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(x -> {

                    for(modeloTrivia trivia:x)datos.add(trivia);
                    adapter.notifyDataSetChanged();
                },
                        e -> {
                    Log.e("llll",e.toString());
                        });

        /* //Sin RXJava
        TriviaApi.getInstance().listCategories().enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {
                Categories result = response.body();
                for (Categories i : result) {
                    Log.e("LogCategories", i.getSocietyCulture());
                }

            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {

            }
        });*/
         /* //Con RXJava
        TriviaApi.getInstance()
                .listCategories()
                .wait(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(x -> {
                   x = categories.getArtsLiterature();
                });

        */

        /* //Sin RXJava
        TriviaApi.getInstance().listMetadata().enqueue(new Callback<Metadata>() {
            @Override
            public void onResponse(Call<Metadata> call, Response<Metadata> response) {
                Metadata result = response.body();
                for (Metadata i : result) {
                    Log.e("LogMetadata", i.getLastCreated());
                }
            }

            @Override
            public void onFailure(Call<Metadata> call, Throwable t) {

            }
        });
        */
        /* //Con RXJava
        TriviaApi.getInstance()
                .listMetadata()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(x ->{
                    for(Metadata metadata:x)datos.add(metadata);
                    adapter.notifyDataSetChanged();
                });

         */

        button = (Button)findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
    }


}
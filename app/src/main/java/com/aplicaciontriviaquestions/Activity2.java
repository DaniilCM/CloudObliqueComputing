package com.aplicaciontriviaquestions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aplicaciontriviaquestions.adapters.CategoryAdapter;
import com.aplicaciontriviaquestions.adapters.RecyclerAdapter;
import com.aplicaciontriviaquestions.rest.model.TriviaApi;
import com.aplicaciontriviaquestions.rest.model.modelCategories.Categories;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity2 extends AppCompatActivity {
    private Categories categories = new Categories();
    private CategoryAdapter adapter;
    RecyclerView recyclerview;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        RecyclerView lista = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new CategoryAdapter(categories);
        lista.setLayoutManager(new LinearLayoutManager(this));
        lista.setAdapter(adapter);


        recyclerview = findViewById(R.id.recyclerview);

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



        /*//Sin RXJava
        TriviaApi.getInstance().listCategories().enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {
                 Categories categories = response.body();
                 for(String category: categories.getArtsLiterature()) {
                     Log.e("Log1", categories.getArtsLiterature());
                 }

            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {

            }
        });
        */


        //Con RXJava
        TriviaApi.getInstance()
                .listCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(x -> {
                    categories = x;
                    //adapter.notifyDataSetChanged();
                    },
                        e -> {
                            Log.e("llll",e.toString());
                });





        button = (Button)findViewById(R.id.btn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
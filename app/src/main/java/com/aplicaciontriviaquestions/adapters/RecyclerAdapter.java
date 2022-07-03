package com.aplicaciontriviaquestions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aplicaciontriviaquestions.R;
import com.aplicaciontriviaquestions.rest.model.modelCategories.Categories;
import com.aplicaciontriviaquestions.rest.model.modelTrivia.modeloTrivia;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TriviaViewHolder>{
    private List<modeloTrivia> datos;

    public RecyclerAdapter(List<modeloTrivia> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public RecyclerAdapter.TriviaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.milayout, parent, false);
        TriviaViewHolder vh = new TriviaViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TriviaViewHolder holder, int position) {
        // get element from your dataset at this position
        // replace the contents of the view with that element
        holder.question.setText(datos.get(position).getQuestion());
        holder.category.setText(datos.get(position).getCategory());
        holder.difficulty.setText(datos.get(position).getDifficulty());
        holder.correctAnswer.setText(datos.get(position).getCorrectAnswer());

    }


    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class TriviaViewHolder extends RecyclerView.ViewHolder{
        private TextView question;
        private TextView category;
        private TextView difficulty;
        private TextView correctAnswer;


        public TriviaViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.question);
            category = itemView.findViewById(R.id.category);
            difficulty = itemView.findViewById(R.id.difficulty);
            correctAnswer = itemView.findViewById(R.id.correctAnswer);

        }
    }

}

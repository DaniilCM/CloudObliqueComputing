package com.aplicaciontriviaquestions.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aplicaciontriviaquestions.R;
import com.aplicaciontriviaquestions.rest.model.modelCategories.Categories;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private Categories categories;

    public CategoryAdapter(Categories categories){this.categories = categories;}

    @NonNull
    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.milayout2, parent, false);
        CategoryViewHolder vh = new CategoryViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CategoryViewHolder holder, int position) {
        // get element from your dataset at this position
        // replace the contents of the view with that element

        //Activity2
       holder.artsLiterature.setText((CharSequence) categories.getArtsLiterature());
       holder.filmTV.setText((CharSequence) categories.getFilmTV());
       holder.foodDrink.setText((CharSequence) categories.getFoodDrink());
       holder.generalKnowledge.setText((CharSequence) categories.getGeneralKnowledge());
       holder.geography.setText((CharSequence) categories.getGeography());
       holder.history.setText((CharSequence) categories.getHistory());
       holder.music.setText((CharSequence) categories.getMusic());
       holder.science.setText((CharSequence) categories.getScience());
       holder.societyCulture.setText((CharSequence) categories.getSocietyCulture());
       holder.sportLeisure.setText((CharSequence) categories.getSportLeisure());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{

        //Activity2
        private TextView artsLiterature;
        private TextView filmTV;
        private TextView foodDrink;
        private TextView generalKnowledge;
        private TextView geography;
        private TextView history;
        private TextView music;
        private TextView science;
        private TextView societyCulture;
        private TextView sportLeisure;



        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            //Activity2
            artsLiterature = itemView.findViewById(R.id.artsLiterature);
            filmTV = itemView.findViewById(R.id.filmTV);
            foodDrink = itemView.findViewById(R.id.foodDrink);
            generalKnowledge = itemView.findViewById(R.id.generalKnowledge);
            geography = itemView.findViewById(R.id.geography);
            history = itemView.findViewById(R.id.history);
            music = itemView.findViewById(R.id.music);
            science = itemView.findViewById(R.id.science);
            societyCulture = itemView.findViewById(R.id.societyCulture);
            sportLeisure = itemView.findViewById(R.id.sportLeisure);


        }
    }
}

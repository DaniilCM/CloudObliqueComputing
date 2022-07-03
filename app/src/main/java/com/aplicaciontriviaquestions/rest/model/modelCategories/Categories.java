package com.aplicaciontriviaquestions.rest.model.modelCategories;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Categories {

    @SerializedName("Arts & Literature")
    @Expose
    private List<String> artsLiterature = null;
    @SerializedName("Film & TV")
    @Expose
    private List<String> filmTV = null;
    @SerializedName("Food & Drink")
    @Expose
    private List<String> foodDrink = null;
    @SerializedName("General Knowledge")
    @Expose
    private List<String> generalKnowledge = null;
    @SerializedName("Geography")
    @Expose
    private List<String> geography = null;
    @SerializedName("History")
    @Expose
    private List<String> history = null;
    @SerializedName("Music")
    @Expose
    private List<String> music = null;
    @SerializedName("Science")
    @Expose
    private List<String> science = null;
    @SerializedName("Society & Culture")
    @Expose
    private List<String> societyCulture = null;
    @SerializedName("Sport & Leisure")
    @Expose
    private List<String> sportLeisure = null;

    public List<String> getArtsLiterature() {
        return artsLiterature;
    }

    public void setArtsLiterature(List<String> artsLiterature) {
        this.artsLiterature = artsLiterature;
    }

    public List<String> getFilmTV() {
        return filmTV;
    }

    public void setFilmTV(List<String> filmTV) {
        this.filmTV = filmTV;
    }

    public List<String> getFoodDrink() {
        return foodDrink;
    }

    public void setFoodDrink(List<String> foodDrink) {
        this.foodDrink = foodDrink;
    }

    public List<String> getGeneralKnowledge() {
        return generalKnowledge;
    }

    public void setGeneralKnowledge(List<String> generalKnowledge) {
        this.generalKnowledge = generalKnowledge;
    }

    public List<String> getGeography() {
        return geography;
    }

    public void setGeography(List<String> geography) {
        this.geography = geography;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public List<String> getMusic() {
        return music;
    }

    public void setMusic(List<String> music) {
        this.music = music;
    }

    public List<String> getScience() {
        return science;
    }

    public void setScience(List<String> science) {
        this.science = science;
    }

    public List<String> getSocietyCulture() {
        return societyCulture;
    }

    public void setSocietyCulture(List<String> societyCulture) {
        this.societyCulture = societyCulture;
    }

    public List<String> getSportLeisure() {
        return sportLeisure;
    }

    public void setSportLeisure(List<String> sportLeisure) {
        this.sportLeisure = sportLeisure;
    }

}
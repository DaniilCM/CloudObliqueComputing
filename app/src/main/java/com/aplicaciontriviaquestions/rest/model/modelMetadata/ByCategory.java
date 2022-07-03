package com.aplicaciontriviaquestions.rest.model.modelMetadata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ByCategory {

    @SerializedName("General Knowledge")
    @Expose
    private Integer generalKnowledge;
    @SerializedName("Society & Culture")
    @Expose
    private Integer societyCulture;
    @SerializedName("History")
    @Expose
    private Integer history;
    @SerializedName("Sport & Leisure")
    @Expose
    private Integer sportLeisure;
    @SerializedName("Geography")
    @Expose
    private Integer geography;
    @SerializedName("Music")
    @Expose
    private Integer music;
    @SerializedName("Film & TV")
    @Expose
    private Integer filmTV;
    @SerializedName("Science")
    @Expose
    private Integer science;
    @SerializedName("Food & Drink")
    @Expose
    private Integer foodDrink;
    @SerializedName("Arts & Literature")
    @Expose
    private Integer artsLiterature;

    public Integer getGeneralKnowledge() {
        return generalKnowledge;
    }

    public void setGeneralKnowledge(Integer generalKnowledge) {
        this.generalKnowledge = generalKnowledge;
    }

    public Integer getSocietyCulture() {
        return societyCulture;
    }

    public void setSocietyCulture(Integer societyCulture) {
        this.societyCulture = societyCulture;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getSportLeisure() {
        return sportLeisure;
    }

    public void setSportLeisure(Integer sportLeisure) {
        this.sportLeisure = sportLeisure;
    }

    public Integer getGeography() {
        return geography;
    }

    public void setGeography(Integer geography) {
        this.geography = geography;
    }

    public Integer getMusic() {
        return music;
    }

    public void setMusic(Integer music) {
        this.music = music;
    }

    public Integer getFilmTV() {
        return filmTV;
    }

    public void setFilmTV(Integer filmTV) {
        this.filmTV = filmTV;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getFoodDrink() {
        return foodDrink;
    }

    public void setFoodDrink(Integer foodDrink) {
        this.foodDrink = foodDrink;
    }

    public Integer getArtsLiterature() {
        return artsLiterature;
    }

    public void setArtsLiterature(Integer artsLiterature) {
        this.artsLiterature = artsLiterature;
    }

}
package com.aplicaciontriviaquestions.rest.model.modelMetadata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("byCategory")
    @Expose
    private ByCategory byCategory;
    @SerializedName("byState")
    @Expose
    private ByState byState;
    @SerializedName("byDifficulty")
    @Expose
    private ByDifficulty byDifficulty;
    @SerializedName("lastCreated")
    @Expose
    private String lastCreated;
    @SerializedName("lastReviewed")
    @Expose
    private String lastReviewed;

    public ByCategory getByCategory() {
        return byCategory;
    }

    public void setByCategory(ByCategory byCategory) {
        this.byCategory = byCategory;
    }

    public ByState getByState() {
        return byState;
    }

    public void setByState(ByState byState) {
        this.byState = byState;
    }

    public ByDifficulty getByDifficulty() {
        return byDifficulty;
    }

    public void setByDifficulty(ByDifficulty byDifficulty) {
        this.byDifficulty = byDifficulty;
    }

    public String getLastCreated() {
        return lastCreated;
    }

    public void setLastCreated(String lastCreated) {
        this.lastCreated = lastCreated;
    }

    public String getLastReviewed() {
        return lastReviewed;
    }

    public void setLastReviewed(String lastReviewed) {
        this.lastReviewed = lastReviewed;
    }

}
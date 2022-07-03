package com.aplicaciontriviaquestions.rest.model.modelMetadata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ByDifficulty {

    @SerializedName("hard")
    @Expose
    private Integer hard;
    @SerializedName("null")
    @Expose
    private Integer _null;
    @SerializedName("easy")
    @Expose
    private Integer easy;
    @SerializedName("medium")
    @Expose
    private Integer medium;

    public Integer getHard() {
        return hard;
    }

    public void setHard(Integer hard) {
        this.hard = hard;
    }

    public Integer getNull() {
        return _null;
    }

    public void setNull(Integer _null) {
        this._null = _null;
    }

    public Integer getEasy() {
        return easy;
    }

    public void setEasy(Integer easy) {
        this.easy = easy;
    }

    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

}
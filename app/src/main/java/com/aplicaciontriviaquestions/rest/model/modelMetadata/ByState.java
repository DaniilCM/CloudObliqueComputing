package com.aplicaciontriviaquestions.rest.model.modelMetadata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ByState {

    @SerializedName("rejected")
    @Expose
    private Integer rejected;
    @SerializedName("approved")
    @Expose
    private Integer approved;
    @SerializedName("pending")
    @Expose
    private Integer pending;

    public Integer getRejected() {
        return rejected;
    }

    public void setRejected(Integer rejected) {
        this.rejected = rejected;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

}
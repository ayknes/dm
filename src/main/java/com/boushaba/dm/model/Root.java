package com.boushaba.dm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("version")
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    String version;

    @JsonProperty("features")
    public ArrayList<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    ArrayList<Feature> features;

    @JsonProperty("attribution")
    public String getAttribution() {
        return this.attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    String attribution;

    @JsonProperty("licence")
    public String getLicence() {
        return this.licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    String licence;

    @JsonProperty("query")
    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    String query;

    @JsonProperty("limit")
    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    int limit;
}

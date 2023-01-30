package com.boushaba.dm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {
    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String label;

    @JsonProperty("score")
    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    double score;

    @JsonProperty("housenumber")
    public String getHousenumber() {
        return this.housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    String housenumber;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("postcode")
    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    String postcode;

    @JsonProperty("citycode")
    public String getCitycode() {
        return this.citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    String citycode;

    @JsonProperty("x")
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double x;

    @JsonProperty("y")
    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double y;

    @JsonProperty("city")
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String city;

    @JsonProperty("context")
    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    String context;

    @JsonProperty("importance")
    public double getImportance() {
        return this.importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    double importance;

    @JsonProperty("street")
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    String street;
}

package com.boushaba.dm.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "label",
        "score",
        "id",
        "type",
        "name",
        "postcode",
        "citycode",
        "x",
        "y",
        "population",
        "city",
        "context",
        "importance",
        "municipality",
        "street"
})
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("label")
    private String label;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("citycode")
    private String citycode;
    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("city")
    private String city;
    @JsonProperty("context")
    private String context;
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("municipality")
    private String municipality;
    @JsonProperty("street")
    private String street;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("citycode")
    public String getCitycode() {
        return citycode;
    }

    @JsonProperty("citycode")
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("importance")
    public Double getImportance() {
        return importance;
    }

    @JsonProperty("importance")
    public void setImportance(Double importance) {
        this.importance = importance;
    }

    @JsonProperty("municipality")
    public String getMunicipality() {
        return municipality;
    }

    @JsonProperty("municipality")
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
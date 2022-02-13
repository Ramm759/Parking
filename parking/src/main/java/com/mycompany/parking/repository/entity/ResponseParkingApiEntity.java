package com.mycompany.parking.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // on ignore les champs non utilisés du Json retourné par l'Api
public class ResponseParkingApiEntity {

    @JsonProperty(value = "records")  // nom du champ du Json retourné par l'Api
    private List<RecordEntity> records; // records : objets retournés par Api Open Data

    public List<RecordEntity> getRecords() {
        return records;
    }

    public void setRecords(List<RecordEntity> records) {
        this.records = records;
    }
}
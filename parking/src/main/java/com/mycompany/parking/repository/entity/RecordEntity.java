package com.mycompany.parking.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) // on ignore les champs non utilisés du Json retourné par l'Api
public class RecordEntity {

    @JsonProperty(value = "fields") // nom du champ du Json retourné par l'Api
    private FieldsEntity fields;    // fields : contenu de l'objet RecordsEntity retourné par Api Open Data

    public FieldsEntity getFields() {
        return fields;
    }

    public void setFields(FieldsEntity fields) {
        this.fields = fields;
    }
}

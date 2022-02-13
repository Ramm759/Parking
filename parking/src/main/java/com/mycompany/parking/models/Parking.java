package com.mycompany.parking.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Parking {
    private String nom;
    private int nbPlacesDispo;
    private int nbPlacesTotal;
    private String status;
    private String heureMaj;

    public Parking() {
    }

    public Parking(String nom, int nbPlacesDispo, int nbPlacesTotal, String status, String heureMaj) {
        this.nom = nom;
        this.nbPlacesDispo = nbPlacesDispo;
        this.nbPlacesTotal = nbPlacesTotal;
        this.status = status;
        this.heureMaj = heureMaj;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlacesDispo() {
        return nbPlacesDispo;
    }

    public void setNbPlacesDispo(int nbPlacesDispo) {
        this.nbPlacesDispo = nbPlacesDispo;
    }

    public int getNbPlacesTotal() {
        return nbPlacesTotal;
    }

    public void setNbPlacesTotal(int nbPlacesTotal) {
        this.nbPlacesTotal = nbPlacesTotal;
    }

    public String getStatut() {
        return status;
    }

    public void setStatut(String statut) {
        this.status = statut;
    }

    public String getHeureMaj() {
        return heureMaj;
    }

    public void setHeureMaj(String jeureMaj) {
        this.heureMaj = jeureMaj;
    }
}

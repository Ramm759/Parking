package com.mycompany.parking.repository;

import com.mycompany.parking.repository.entity.ResponseParkingApiEntity;

// Api Open Data
// https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut
public interface ParkingApiRepositoryInterface {
    public ResponseParkingApiEntity getListParkings();

}

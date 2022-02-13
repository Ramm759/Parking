package com.mycompany.parking.repository.impl;

import com.mycompany.parking.repository.ParkingApiRepositoryInterface;
import com.mycompany.parking.repository.entity.ResponseParkingApiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ParkingRepositoryImpl implements ParkingApiRepositoryInterface {
    private static final String URL_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&rows=-1&facet=grp_nom&facet=grp_statut";

    @Autowired
    private RestTemplate restTemplate; // RestTemplate permet d'acceder à l'Api Open Data

    @Override
    public ResponseParkingApiEntity getListParkings() {
        return restTemplate.getForEntity(URL_API_OPEN_DATA, ResponseParkingApiEntity.class).getBody();
    }
}

package com.mycompany.parking.services.impl;

import com.mycompany.parking.models.Parking;
import com.mycompany.parking.repository.ParkingApiRepositoryInterface;
import com.mycompany.parking.repository.entity.RecordEntity;
import com.mycompany.parking.repository.entity.ResponseParkingApiEntity;
import com.mycompany.parking.services.ParkingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingServiceInterface {

    @Autowired
    public ParkingApiRepositoryInterface parkingApiDao;

    @Override
    public List<Parking> getListParkings() {
        ResponseParkingApiEntity reponse = parkingApiDao.getListParkings();
        return transformEntityToModel(reponse);
    }

    private List<Parking> transformEntityToModel(ResponseParkingApiEntity reponse) {
        List<Parking> resultat = new ArrayList<Parking>();
        for (RecordEntity record : reponse.getRecords()) {
            Parking parking = new Parking();
            parking.setNom(record.getFields().getGrpNom());
            parking.setStatut(record.getFields().getGrpStatut());
            parking.setNbPlacesDispo(record.getFields().getGrpDisponible());
            parking.setNbPlacesTotal(record.getFields().getGrpExploitation());
            parking.setHeureMaj(record.getFields().getGrpHorodatage());
            resultat.add(parking);
        }
        return resultat;
    }

}
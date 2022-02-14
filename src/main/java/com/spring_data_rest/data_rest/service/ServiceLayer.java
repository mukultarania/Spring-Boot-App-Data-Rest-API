package com.spring_data_rest.data_rest.service;

import java.util.List;

import com.spring_data_rest.data_rest.entity.City;
import com.spring_data_rest.data_rest.repo.CityRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    private final CityRepo cityRepo;

    @Autowired
    public ServiceLayer(CityRepo cityRepo){
        this.cityRepo = cityRepo;
    }

    public List<City> getCities(){
        return cityRepo.findAll();
    }

    public City saveCity(City city) {
        return cityRepo.save(city);
    }

}

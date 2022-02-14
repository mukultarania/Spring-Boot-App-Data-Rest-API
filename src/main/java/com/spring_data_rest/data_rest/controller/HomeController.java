package com.spring_data_rest.data_rest.controller;

import java.util.List;

import com.spring_data_rest.data_rest.entity.City;
import com.spring_data_rest.data_rest.service.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/city")
public class HomeController {
    // private final ServiceLayer serviceLayer;
    
    // @Autowired
    // public HomeController(ServiceLayer sl){
    //     this.serviceLayer = sl;
    // }

    // @GetMapping("")
    // public ResponseEntity<List<City>> selectCity(){
    //     return new ResponseEntity<>(serviceLayer.getCities(), HttpStatus.OK);
    // }

    // @PostMapping("")
    // public ResponseEntity<City> postCity(@RequestBody City city) {
    //     return new ResponseEntity<>(serviceLayer.saveCity(city), HttpStatus.CREATED );
    // }
}

package com.spring_data_rest.data_rest.repo;

import com.spring_data_rest.data_rest.entity.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cities")
public interface CityRepo extends JpaRepository<City, Integer>{}

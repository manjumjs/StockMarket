package com.spring.manju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.manju.bean.CompanyEntity;
import com.spring.manju.service.SectorService;

@RestController
public class SectorController {
	
	@Autowired
    SectorService service;

    //GET ALL COMPANIES FROM SECTOR
    @GetMapping("/sector/listCompanies/{sector}")
    public ResponseEntity<List<CompanyEntity>> getListOfCompaniesInSector(@PathVariable String sector){
        return ResponseEntity.status(HttpStatus.FOUND).body(service.getListOfCompaniesInSector(sector));
    }

    //GET ALL STOCK PRICE FROM RANGE
    @GetMapping("/sector/price/{sectorId}/from/{from}/to/{to}")
    public ResponseEntity<Double> getSectorPrice(@PathVariable String sectorId,@PathVariable String from,@PathVariable String to){
        return ResponseEntity.status(HttpStatus.FOUND).body(service.getSectorPrice(sectorId,from,to));
    }

}

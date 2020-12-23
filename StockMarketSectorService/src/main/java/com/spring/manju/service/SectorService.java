package com.spring.manju.service;

import java.util.List;

import com.spring.manju.bean.CompanyEntity;

public interface SectorService {
	
	public List<CompanyEntity> getListOfCompaniesInSector(String s);
    public double getSectorPrice(String sId, String from, String to);

}

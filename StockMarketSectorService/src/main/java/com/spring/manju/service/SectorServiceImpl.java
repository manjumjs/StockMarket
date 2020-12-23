package com.spring.manju.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.manju.bean.CompanyEntity;
import com.spring.manju.bean.Sector;
import com.spring.manju.bean.StockPrice;
import com.spring.manju.repository.CompanyRepository;
import com.spring.manju.repository.SectorRepository;
import com.spring.manju.repository.StockPriceRepository;

@Service
public class SectorServiceImpl implements SectorService {
	@Autowired
    SectorRepository sectorRepo;
    @Autowired
    CompanyRepository companyRepo;
    @Autowired
    StockPriceRepository stockRepo;
	
	
	@Override
	@Transactional
    public List<CompanyEntity> getListOfCompaniesInSector(String sector){
        
		return companyRepo.getAllBySector(sector);
        
        
    }

    @Override
    @Transactional
    public double getSectorPrice(String sectorId, String from, String to){
    	List<Sector> list = sectorRepo.getAllBySectorId(sectorId);
        String sName= list.get(0).getSector();
       
        List<CompanyEntity> companyList = companyRepo.getAllBySector(sName);
        List<String> companyCodeList =new ArrayList<>();
        for (CompanyEntity company:companyList) {
            companyCodeList.add(company.getCompanyCode());
        }
        List<StockPrice> stockPrice = stockRepo.getAll(companyCodeList, Date.valueOf(from), Date.valueOf(to));
        		
        
        double x = 0.0;
        for(int i=0;i<stockPrice.size();i++)
        {
            x = x + stockPrice.get(i).getCurrentPrice();
        }
        x = x / stockPrice.size();
        return x;
    }

}

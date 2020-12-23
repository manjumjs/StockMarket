package com.spring.manju.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.manju.bean.Sector;


@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
	
	public List<Sector> getAllBySectorId(String sectorId);

}

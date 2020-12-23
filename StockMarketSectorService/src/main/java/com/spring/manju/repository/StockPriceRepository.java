package com.spring.manju.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.manju.bean.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {

	@Query(value = "SELECT * FROM STOCKPRICE s WHERE s.company_code IN (:companyCode) "
			+ "AND s.date BETWEEN (:fromDate) AND (:toDate)",
            nativeQuery = true)
    public List<StockPrice> getAll(@Param("companyCode")List<String> companyCode, 
    		@Param("fromDate")Date fromDate,@Param("toDate")Date toDate);
}

package com.devusperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devusperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	

}

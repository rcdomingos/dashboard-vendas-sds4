package com.rcdomingos.dsvendas.repositories;

import com.rcdomingos.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

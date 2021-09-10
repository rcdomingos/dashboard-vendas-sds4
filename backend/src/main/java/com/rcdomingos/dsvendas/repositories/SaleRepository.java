package com.rcdomingos.dsvendas.repositories;

import com.rcdomingos.dsvendas.dto.SaleSuccessDTO;
import com.rcdomingos.dsvendas.dto.SaleSumDTO;
import com.rcdomingos.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.rcdomingos.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.rcdomingos.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}

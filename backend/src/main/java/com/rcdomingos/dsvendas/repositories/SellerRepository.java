package com.rcdomingos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdomingos.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

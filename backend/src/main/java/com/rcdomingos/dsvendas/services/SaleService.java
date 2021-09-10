package com.rcdomingos.dsvendas.services;

import com.rcdomingos.dsvendas.dto.SaleDTO;
import com.rcdomingos.dsvendas.dto.SellerDTO;
import com.rcdomingos.dsvendas.entities.Sale;
import com.rcdomingos.dsvendas.entities.Seller;
import com.rcdomingos.dsvendas.repositories.SaleRepository;
import com.rcdomingos.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }
}

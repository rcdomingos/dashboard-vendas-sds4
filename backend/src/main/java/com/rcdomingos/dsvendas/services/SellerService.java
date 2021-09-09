package com.rcdomingos.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcdomingos.dsvendas.dto.SellerDTO;
import com.rcdomingos.dsvendas.entities.Seller;
import com.rcdomingos.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAllSellers() {
		List<Seller> result = repository.findAll();
		return result.stream().map(item -> new SellerDTO(item)).collect(Collectors.toList());
	}
}

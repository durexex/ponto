package com.durex.ponto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durex.ponto.dto.TankDTO;
import com.durex.ponto.services.TankService;

@RestController
@RequestMapping(value = "/tanks")
public class TankController {
	
	@Autowired
	private TankService service;
	
	@GetMapping
	public Page<TankDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);		
	}
	
	@GetMapping(value = "/{id}")
	public TankDTO findById(@PathVariable Integer id) {
		return service.findById(id);	 	
	}
	
	

}

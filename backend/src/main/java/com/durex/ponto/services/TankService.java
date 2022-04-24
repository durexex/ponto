package com.durex.ponto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.durex.ponto.dto.TankDTO;
import com.durex.ponto.entities.Tank;
import com.durex.ponto.repositories.TankRepository;

@Service
public class TankService {

	@Autowired
	private TankRepository repo;
	
	@Transactional(readOnly = true)
	public Page<TankDTO> findAll(Pageable pageable) {
		Page<Tank> result = repo.findAll(pageable);		
		Page<TankDTO> page = result.map(x -> new TankDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public TankDTO findById(Integer id) {
		Tank result = repo.findById(id).get();		
		TankDTO  dto = new TankDTO(result);
		return dto;
	}

}

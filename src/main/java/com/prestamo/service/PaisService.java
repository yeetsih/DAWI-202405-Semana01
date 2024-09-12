package com.prestamo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prestamo.entity.Pais;

@Service
public interface PaisService {

	public List<Pais> findAll();
}

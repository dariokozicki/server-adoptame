package com.adoptame.domain.service;

import org.springframework.data.domain.Page;

import java.util.Optional;

public interface CrudService<T>{
	Optional<T> findById(Long id);
	T save(T elem);
	void deleteById(Long id);
	Page<T> getPage(Integer page);
}

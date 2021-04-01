package com.adoptame.domain.service.refuge;

import com.adoptame.domain.entity.refuge.Refuge;
import com.adoptame.domain.repository.IRefugeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public class RefugeService implements IRefugeService{
	private IRefugeRepository refugeRepository;

	@Autowired
	public RefugeService(IRefugeRepository refugeRepository){
		this.refugeRepository = refugeRepository;
	}

	@Override
	public Optional<Refuge> findById(Long id) {
		return refugeRepository.findById(id);
	}

	@Override
	public Refuge save(Refuge elem) {
		return refugeRepository.save(elem);
	}

	@Override
	public void deleteById(Long id) {
		refugeRepository.deleteById(id);
	}

	@Override
	public Page<Refuge> getPage(Integer page) {
		return refugeRepository.findAll(PageRequest.of(page, 20));
	}
}
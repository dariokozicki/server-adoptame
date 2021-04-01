package com.adoptame.domain.service.pet;

import com.adoptame.domain.entity.pet.Pet;
import com.adoptame.domain.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("PetService")
public class PetService implements IPetService{
	private IPetRepository petRepository;

	@Autowired
	public PetService(IPetRepository petRepository){
		this.petRepository = petRepository;
	}

	@Override
	public Optional<Pet> findById(Long id) {
		return petRepository.findById(id);
	}

	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

	@Override
	public Page<Pet> getPage(Integer page){
		return petRepository.findAll(PageRequest.of(page, 20));
	}
}
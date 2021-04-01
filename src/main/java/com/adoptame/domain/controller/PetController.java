package com.adoptame.domain.controller;

import com.adoptame.domain.entity.pet.Pet;
import com.adoptame.domain.service.pet.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {
	private IPetService petService;

	@Autowired
	public PetController(IPetService petService){
		this.petService = petService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pet> getPet(@PathVariable long id){
		return petService.findById(id)
			.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
			.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("")
	public ResponseEntity<Pet> createPet(@RequestBody Pet pet){
		pet.setDateRegister(LocalDateTime.now());
		return Optional.ofNullable(petService.save(pet))
			.map(thePet -> new ResponseEntity<>(thePet, HttpStatus.CREATED))
			.orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pet> updatePet(@RequestBody Pet pet, @PathVariable Long id){
		pet.setId(id);
		return Optional.ofNullable(petService.save(pet))
			.map(thePet -> new ResponseEntity<>(thePet, HttpStatus.ACCEPTED))
			.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable Long id){
		petService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@GetMapping("")
	public ResponseEntity<Page<Pet>> getPets(@RequestParam(defaultValue = "0") int page){
		return new ResponseEntity<>(petService.getPage(page), HttpStatus.OK);
	}
}
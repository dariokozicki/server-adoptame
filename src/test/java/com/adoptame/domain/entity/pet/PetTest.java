package com.adoptame.domain.entity.pet;

import com.adoptame.domain.entity.pet.adoptionState.NotAdopted;
import com.adoptame.domain.entity.pet.ageCategory.Grown;
import com.adoptame.domain.entity.pet.sex.Sex;
import com.adoptame.domain.entity.pet.size.PetSize;
import com.adoptame.domain.entity.pet.species.Dog;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

class PetTest {
	private Pet pet;

	@BeforeEach
	void setUp() {
		pet = Pet.builder()
			.id(1L)
			.description("Soy un perrito adorable.")
			.ageCategory(new Grown())
			.birthday(LocalDateTime.now())
			.dateRegister(LocalDateTime.now())
			.image("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2019/12/03202400/Yellow-Labrador-Retriever.jpg")
			.name("Doggy")
			.neutered(true)
			.petSize(new PetSize(1L, "Small"))
			.sex(new Sex(1L, "Male"))
			.species(new Dog())
			.state(new NotAdopted())
			.build();
	}
}
package com.adoptame.domain.repository;

import com.adoptame.domain.entity.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetRepository extends JpaRepository<Pet, Long> {
}

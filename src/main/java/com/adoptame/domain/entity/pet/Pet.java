package com.adoptame.domain.entity.pet;

import com.adoptame.domain.entity.pet.adoptionState.AdoptionState;
import com.adoptame.domain.entity.pet.ageCategory.AgeCategory;
import com.adoptame.domain.entity.pet.sex.Sex;
import com.adoptame.domain.entity.pet.species.Species;
import com.adoptame.domain.entity.pet.size.PetSize;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Pet {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String image;
	@Column
	private LocalDateTime dateRegister;
	@Column
	private LocalDateTime birthday;
	@ManyToOne
	private AdoptionState state;
	@ManyToOne
	private Species species;
	@ManyToOne
	private Sex sex;
	@Column
	private boolean neutered;
	@ManyToOne
	private AgeCategory ageCategory;
	@ManyToOne
	private PetSize petSize;

}
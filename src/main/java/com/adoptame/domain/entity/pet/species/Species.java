package com.adoptame.domain.entity.pet.species;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class Species {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
}

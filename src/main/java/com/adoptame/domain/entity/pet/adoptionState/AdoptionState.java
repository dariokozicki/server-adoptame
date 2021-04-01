package com.adoptame.domain.entity.pet.adoptionState;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AdoptionState {
	@Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}

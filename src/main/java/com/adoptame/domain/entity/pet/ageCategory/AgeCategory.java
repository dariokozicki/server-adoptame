package com.adoptame.domain.entity.pet.ageCategory;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AgeCategory {
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column
	private Long id;
}

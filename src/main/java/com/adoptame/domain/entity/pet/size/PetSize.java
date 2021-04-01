package com.adoptame.domain.entity.pet.size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetSize {
	@Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
}

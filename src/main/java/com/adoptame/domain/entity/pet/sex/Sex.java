package com.adoptame.domain.entity.pet.sex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sex {
	@Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
}

package com.adoptame.domain.entity.refuge;

import com.adoptame.domain.entity.pet.Pet;
import com.adoptame.domain.entity.refuge.position.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Refuge {
	@Id
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	@OneToOne
	private Position position;
	@Column
	private String image;
	@OneToMany
	private List<Pet> pets;
}
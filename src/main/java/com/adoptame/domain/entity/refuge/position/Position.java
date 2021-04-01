package com.adoptame.domain.entity.refuge.position;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Position {
	@Id
	@Column
	private Long id;
	@Column
	private String description;
	@Column
	private Long longitude;
	@Column
	private Long latitude;
}
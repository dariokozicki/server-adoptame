package com.adoptame.domain.repository;

import com.adoptame.domain.entity.refuge.Refuge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRefugeRepository extends JpaRepository<Refuge, Long> {
}

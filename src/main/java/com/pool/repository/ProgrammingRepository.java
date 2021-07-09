package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.modal.Programming;

@Repository
public interface ProgrammingRepository extends JpaRepository<Programming, Integer> {

}

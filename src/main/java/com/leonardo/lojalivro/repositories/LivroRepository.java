package com.leonardo.lojalivro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.lojalivro.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}

package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
<<<<<<< HEAD
	
public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
=======
  
 // @Repository
>>>>>>> 1ee1ded57ad8e080e6e79c5f70a2395b5f348ff9

}

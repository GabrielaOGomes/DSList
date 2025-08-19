package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface  GameRepository extends JpaRepository<Game, Long> {

    // This interface will automatically provide CRUD operations for Game entities
    // No additional methods are needed unless custom queries are required
   
    
}

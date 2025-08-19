package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface  GameListRepository extends JpaRepository<GameList, Long> {

    // This interface will automatically provide CRUD operations for Game entities
    // No additional methods are needed unless custom queries are required
   
    
}

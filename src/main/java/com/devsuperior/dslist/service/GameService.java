package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;

//registra como um componente do sistema
@Service
public class GameService {

    //Injeta uma instancia do GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll() {
        // Aqui você implementaria a lógica para buscar todos os jogos
        List<Game> result = gameRepository.findAll();
        return result.stream()
                .map(x -> new GameMinDTO(x))
                .toList();
    }
}

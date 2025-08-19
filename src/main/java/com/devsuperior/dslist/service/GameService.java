package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;


//registra como um componente do sistema
@Service
public class GameService {

    //Injeta uma instancia do GameRepository no GameService
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        // Aqui você implementaria a lógica para buscar um jogo por ID
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        // Aqui você implementaria a lógica para buscar todos os jogos
        List<Game> result = gameRepository.findAll();
        return result.stream()
                .map(x -> new GameMinDTO(x))
                .toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        // Aqui você implementaria a lógica para buscar jogos por lista
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream()
                .map(x -> new GameMinDTO(x))
                .toList();
    }


}

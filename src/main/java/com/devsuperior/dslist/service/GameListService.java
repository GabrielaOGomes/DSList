package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;

import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;



//registra como um componente do sistema
@Service
public class GameListService {

    //Injeta uma instancia do GameRepository no GameService
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        // Aqui você implementaria a lógica para buscar todos os jogos
        List<GameList> result = gameListRepository.findAll();
        return result.stream()
                .map(x -> new GameListDTO(x))
                .toList();
    }
}

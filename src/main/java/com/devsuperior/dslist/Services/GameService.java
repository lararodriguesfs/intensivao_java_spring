package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.Dtos.GameDTO;
import com.devsuperior.dslist.Dtos.GameMinDto;
import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Projections.GameMinProjection;
import com.devsuperior.dslist.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll () {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList (Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }



}

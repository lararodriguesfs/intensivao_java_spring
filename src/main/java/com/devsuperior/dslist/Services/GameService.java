package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.Dtos.GameMinDto;
import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll () {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}

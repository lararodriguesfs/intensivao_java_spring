package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.Dtos.GameListDTO;
import com.devsuperior.dslist.Dtos.GameMinDto;
import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Entities.GameList;
import com.devsuperior.dslist.Repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

        @Autowired
        private GameListRepository gameListRepository;

        @Transactional(readOnly = true)
        public List<GameListDTO> findAll () {
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map(x -> new GameListDTO(x)).toList();

        }
    }














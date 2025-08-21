package com.devsuperior.dslist.Controllers;

import com.devsuperior.dslist.Dtos.GameMinDto;
import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; // Corrigido aqui
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.findAll();
        return result;
    }
}

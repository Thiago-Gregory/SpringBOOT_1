package com.Gregory.HelloWorldNoLombok.controller;

import com.Gregory.HelloWorldNoLombok.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * author Thiago Araújo
 * @since 15/04/2020 - 21:56
 * @version 1.0
 */
@RestController
public class GameController {

    @GetMapping("/game")
    public Game getGame() {
        Game game = new Game();
        game.setTitle("Horizon Zero Dawn");
        game.setGenre("RPG, Action-adventure");
        game.setReleaseDate("28/02/2017");
        game.setPrice(69.90);

        return game;
    }

    @GetMapping("/listgames")
    public ArrayList<Game> getListGames() {
        Game game1 = new Game();
        game1.setTitle("The Last of Us");
        game1.setGenre("Survival Horror, Action-adventure");
        game1.setReleaseDate("14/06/2013");
        game1.setPrice(59.99);

        Game game2 = new Game();
        game2.setTitle("GTA VI");
        game2.setGenre("Action-adventure");
        game2.setReleaseDate("--/--/----");
        game2.setPrice(0);

        Game game3 = new Game();
        game3.setTitle("Horizon Zero Dawn");
        game3.setGenre("RPG, Action-adventure");
        game3.setReleaseDate("28/02/2017");
        game3.setPrice(69.90);

        ArrayList<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);

        return games;
    }
}

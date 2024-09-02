package com.example.joke.controller;

import com.example.joke.domain.jokeResponse;
import com.example.joke.service.joke.jokeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class jokeController {
    private final jokeService jokeService;

    public jokeController(jokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/random")
    public jokeResponse getJoke(){
          return jokeService.getCurrentJoke();
    }

    @GetMapping("/types")
    public jokeResponse getJokeTypes(){
          return jokeService.getCurrentTypes();
    }

    @GetMapping("/fun/{jokeType}")
    public jokeResponse getJokeTypePathVar(@PathVariable String jokeType){
            return jokeService.getJokeType(jokeType);
    }


}

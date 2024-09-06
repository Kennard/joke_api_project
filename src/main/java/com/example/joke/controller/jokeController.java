package com.example.joke.controller;

import com.example.joke.domain.jokeResponse;
import com.example.joke.service.joke.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jokeController {

@Autowired
private JokeService jokeService;

    @GetMapping("/random_joke")
    public jokeResponse getJokeSec(){
        return jokeService.getCurrentJoke();
    }

    @GetMapping("/types")
    public jokeResponse getJokeTypeList(){
        return jokeService.getCurrentTypes();
    }

    @GetMapping("/rand/{jokeType}")
    public jokeResponse getJokeTypePath(@PathVariable String jokeType) {
        return jokeService.getJokeType(jokeType);
    }

}

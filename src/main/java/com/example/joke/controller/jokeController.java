package com.example.joke.controller;

import com.example.joke.domain.jokeResponse;
import com.example.joke.service.joke.jokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jokeController {

@Autowired
private jokeService JokeService;

    @GetMapping("/random_joke")
    public jokeResponse getJokeSec(){
        return JokeService.getCurrentJoke();
    }

    @GetMapping("/types")
    public jokeResponse getJokeTypes(){
        return JokeService.getCurrentTypes();
    }

    @GetMapping("/type/{jokeType}")
    public jokeResponse getJokeTypePathVar(@PathVariable String jokeType) {
        return JokeService.getJokeType(jokeType);
    }

    @GetMapping("/joke/{jokeNum}")
    public jokeResponse getJokeNumPathVar(@PathVariable Integer jokeNum) {
        return JokeService.getJokeNum(jokeNum);
    }


}

package com.example.joke.service.joke;

import com.example.joke.domain.jokeResponse;

public interface JokeService {
    jokeResponse getCurrentJoke();
    jokeResponse getTypesList();
    jokeResponse getJokeType(String jokeType);
    jokeResponse getJokeID(String idNum);
}

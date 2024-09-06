package com.example.joke.service.joke;

import com.example.joke.domain.jokeResponse;

public interface JokeService {
    jokeResponse getCurrentJoke();
    jokeResponse getCurrentTypes();
    jokeResponse getJokeType(String jokeType);
}

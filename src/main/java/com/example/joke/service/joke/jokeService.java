package com.example.joke.service.joke;

import com.example.joke.domain.jokeResponse;

public interface jokeService {
    jokeResponse getCurrentJoke();

    jokeResponse getCurrentTypes();

    jokeResponse getJokeType(String jokeType);

}

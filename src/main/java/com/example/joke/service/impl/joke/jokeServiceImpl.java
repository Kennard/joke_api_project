package com.example.joke.service.impl.joke;

import com.example.joke.domain.jokeResponse;
import com.example.joke.service.joke.jokeService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class jokeServiceImpl implements jokeService {

    @Override
    public jokeResponse getCurrentJoke() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", jokeResponse.class);
    }

    @Override
    public jokeResponse getCurrentTypes() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/types", jokeResponse.class);
    }

    @Override
    public jokeResponse getJokeType(String jokeType) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/"+ jokeType +"/random", jokeResponse.class);
    }

    // Just a test of an additional endpoint
    @Override
    public jokeResponse getJokeNum(Integer jokeNum) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/random/"+ jokeNum, jokeResponse.class);
    }

}

package com.example.joke.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class jokeResponse {
    private String type;
    private String setup;
    private String punchline;
    private int id;
 }

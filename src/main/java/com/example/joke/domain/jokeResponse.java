package com.example.joke.domain;


import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;

@Getter
@Setter
public class jokeResponse {

    private String type;
    private String setup;
    private String punchline;
    private int id;

 }

package com.felipecook.codebreaker.model;

import com.felipecook.codebreaker.model.Code.Guess;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Game {

  private final Code code;
  private final List<Guess> guesses = new LinkedList<>();
  private final String pool;
  private final int length;

  public Game(String pool, int length, Random rng){
    code = new Code(pool, length, rng);

  }

}

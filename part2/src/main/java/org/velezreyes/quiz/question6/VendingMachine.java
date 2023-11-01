package org.velezreyes.quiz.question6;

public interface VendingMachine {
  int value_scottCola = 75;
  int value_tea = 100;
  public void insertQuarter();

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
}
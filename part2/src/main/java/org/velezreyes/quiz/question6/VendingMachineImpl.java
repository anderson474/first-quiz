package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private static VendingMachineImpl instancia;
  public int money_insert;
  public static VendingMachine getInstance() {
    if (instancia == null) {
      instancia = new VendingMachineImpl();
    }
    return instancia;
  }
  public void insertQuarter(){
    this.money_insert = this.money_insert+25;
  }

  public Drink pressButton(String name) throws UnknownDrinkException, NotEnoughMoneyException {
    NewDrink drink1 = new NewDrink(name);
    int money = getMoney_insert();
    if(money<value_scottCola && name.equals("ScottCola") ){
      throw new NotEnoughMoneyException();
    } else if(money<value_tea && name.equals("KarenTea")) {
      throw new NotEnoughMoneyException();
    } else if (!name.equals("ScottCola") && !name.equals("KarenTea")){
      throw new UnknownDrinkException();
    }else{
      return drink1;
    }
  }

  public int getMoney_insert() {
    return this.money_insert;
  }
}


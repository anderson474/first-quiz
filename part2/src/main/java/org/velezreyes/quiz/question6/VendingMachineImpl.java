package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private static VendingMachineImpl instancia;
  public int money_insert = 0;
  public static VendingMachine getInstance() {
    if (instancia == null) {
      instancia = new VendingMachineImpl();
    }
    return instancia;
  }
  public void insertQuarter(){
    this.money_insert = this.money_insert+25;
  }

  public Drink pressButton(String name) {
    NewDrink drink1 = new NewDrink(name);
    try{
      if(this.money_insert<value_scottCola && name.equals("ScottCola") ){
        throw new NotEnoughMoneyException();
      }
      if (this.money_insert<value_tea && name.equals("KarenTea")) {
        throw new NotEnoughMoneyException();
      }
      if (name.equals("ScottCola") == false && name.equals("KarenTea") == false){
        throw new UnknownDrinkException();
      }

    }catch (NotEnoughMoneyException e) {
      e.getMessage();
    }catch(UnknownDrinkException u){
      u.getMessage();
    }
    return drink1;
  }
}

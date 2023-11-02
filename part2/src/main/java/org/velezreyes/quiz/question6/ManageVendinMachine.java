package org.velezreyes.quiz.question6;

public class ManageVendinMachine {
    public static void main(String[] args) {
        try{
            VendingMachine vm = VendingMachineImpl.getInstance();

            vm.insertQuarter();
            vm.insertQuarter();
            vm.insertQuarter();



            vm.pressButton("KarenTea");


            vm.insertQuarter();

            Drink drink = vm.pressButton("KarenTea");
            drink.isFizzy();
            drink.getName();


        }catch (NotEnoughMoneyException e) {
            System.out.println("not");;
        } catch (UnknownDrinkException e) {
            System.out.println("no se puede meter aca");;
        }
    }
}

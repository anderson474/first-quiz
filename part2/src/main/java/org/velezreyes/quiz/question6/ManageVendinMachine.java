package org.velezreyes.quiz.question6;

public class ManageVendinMachine {
    public static void main(String[] args) {
        try{
            VendingMachine vm = VendingMachineImpl.getInstance();

            vm.insertQuarter();
            vm.insertQuarter();
            vm.insertQuarter();

            // Test that KarenTea costs more than 75 cents.

            vm.pressButton("KarenTea");


        }catch (NotEnoughMoneyException e) {
            System.out.println("not");;
        } catch (UnknownDrinkException e) {
            System.out.println("yes");;
        }
    }
}

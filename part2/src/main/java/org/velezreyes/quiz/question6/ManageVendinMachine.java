package org.velezreyes.quiz.question6;

public class ManageVendinMachine {
    public static void main(String[] args) {
        VendingMachine vm = VendingMachineImpl.getInstance();
        vm.insertQuarter();
        vm.insertQuarter();
        vm.insertQuarter();
        vm.pressButton("ScottCola");
        System.out.println("nada");
    }

}

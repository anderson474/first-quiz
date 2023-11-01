package org.velezreyes.quiz.question6;

public class NewDrink implements Drink{
    public String name;
    public NewDrink(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFizzy() {
        if(this.name.equals("ScottCola")){
            return true;
        } else if (this.name.equals("KarenTea")) {
            return false;
        } else {
            return false;
        }
    }
}

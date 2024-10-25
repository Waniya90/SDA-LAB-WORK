/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangocakemaker;

/**
 *
 * @author Hp
 */
public class IngredientPreparer {
 
    public void prepareIngredients(String[] ingredients) {
        for (String ingredient : ingredients) {
            System.out.println("Measuring " + ingredient);
        }
    }


    public void mixIngredients() {
        System.out.println("Mixing flour, eggs, sugar, and butter...");
    }



    public void bake(int temperature, int time) {
        System.out.println("Baking the cake at " + temperature + "°C for " + time + " minutes.");
    }



    public void prepareMangoTopping() {
        System.out.println("Preparing mango slices for topping...");
    }



    public void decorateCake() {
        System.out.println("Decorating the cake with mango topping...");
    }



    public void cleanKitchen() {
        System.out.println("Cleaning the kitchen...");
    }
}





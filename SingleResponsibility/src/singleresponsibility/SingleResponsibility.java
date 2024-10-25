/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

/**
 *
 * @author Hp
 */
public class SingleResponsibility {

    // Class for handling ingredient preparation
class IngredientPreparer {
    public void prepareIngredients(String[] ingredients) {
        for (String ingredient : ingredients) {
            System.out.println("Measuring " + ingredient);
        }
    }
}

// Class for mixing ingredients
class IngredientMixer {
    public void mixIngredients() {
        System.out.println("Mixing flour, eggs, sugar, and butter...");
    }
}

// Class for baking the cake
class CakeBaker {
    public void bake(int temperature, int time) {
        System.out.println("Baking the cake at " + temperature + "°C for " + time + " minutes.");
    }
}

// Class for preparing mango topping
class MangoToppingPreparer {
    public void prepareMangoTopping() {
        System.out.println("Preparing mango slices for topping...");
    }
}

// Class for decorating the cake
class CakeDecorator {
    public void decorateCake() {
        System.out.println("Decorating the cake with mango topping...");
    }
}

// Class for cleaning the kitchen
class KitchenCleaner {
    public void cleanKitchen() {
        System.out.println("Cleaning the kitchen...");
    }
}

// Main class to coordinate the process
public class MangoCakeMaker {
    public static void main(String[] args) {
        String[] ingredients = {"Flour", "Eggs", "Sugar", "Butter", "Mango"};
        
        IngredientPreparer preparer = new IngredientPreparer();
        IngredientMixer mixer = new IngredientMixer();
        CakeBaker baker = new CakeBaker();
        MangoToppingPreparer toppingPreparer = new MangoToppingPreparer();
        CakeDecorator decorator = new CakeDecorator();
        KitchenCleaner cleaner = new KitchenCleaner();
        
        preparer.prepareIngredients(ingredients);
        mixer.mixIngredients();
        baker.bake(180, 30);
        toppingPreparer.prepareMangoTopping();
        decorator.decorateCake();
        cleaner.cleanKitchen();
    }
}

}

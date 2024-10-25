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
public class MangoCakeMaker {

   
    public static void main(String[] args) {
        String[] ingredients = {"Flour", "Eggs", "Sugar", "Butter", "Mango"};
       
        IngredientPreparer preparer = new IngredientPreparer();
        IngredientMixer mixer = new IngredientMixer();
        
        Cake baker = new Cake();
        Topping ToppingStoppingPreparer = new Topping();
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
//IMplementing all mthodds in class mixing ingredients , ingredientoreparer,cakebaker,mango topping, cake decorater ,kitchencleaner that voilated the single responisbility principle )


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.creational.factorymethod;

/**
 *
 * @author Usuário
 */
public interface PizzaIngredientFactory {
    public abstract String createDough();
    public abstract String createSauce();
    public abstract String createCheese();
    public abstract String createVeggies();
    public abstract String createPepperoni();
    public abstract String createClam();
    
}

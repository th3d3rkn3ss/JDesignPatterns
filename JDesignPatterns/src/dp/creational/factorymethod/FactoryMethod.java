
package dp.creational.factorymethod;


public class FactoryMethod {

    public static void main(String[] args) {
        
        HamburguerStore nyMcStore = new McDonalds();
        nyMcStore.orderHamburguer("BigMac");
        
    }
}

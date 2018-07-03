/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghost;

/**
 *
 * @author CLAB_36
 */

public class Ghost2 {
    
    String name="LED MONITOR";
    double price=2000000;
    int quantity =10;
    
    void changeName(String newName)
    {
    name=newName;    
    }
    void changePrice(double newPrice)
    {
    price=newPrice;    
    }
    void changeQuantity(int newQuantity)
    {
    quantity=newQuantity;    
    }
    void printChanges()
    {
    System.out.println("Product: "+name+",Price: "+price+", Quantity: "+quantity);    
    }

    public static void main(String[] args)
    {
        Ghost2 name = new Ghost2();
        name.printChanges();
    }
    
}

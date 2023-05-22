/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusth
 */
public class Products {
    
    private int productCost, quanity; 
    private String productName;
    static int productID = 0;
    
    Products(String name, int i){
        this.productName = name;
        this.quanity = i;
        productID += 1;
        totalCost(i, name);
    }
    
    private void totalCost(int q, String n){
        
        switch(n){
            case "Black" : productCost = 10 * q; break;
            case "Americano" : productCost = 15 * q; break;
            case "Cappuccino" : productCost = 20 * q; break;
            case "Espresso" : productCost = 5 * q; break;
            case "Latte" : productCost = 25 * q; break;
            case "Mocca" : productCost = 30 * q; break;
            default: break;
        }
        
    }
    
    public int getCost(){
        return this.productCost;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public int getQuanity(){
        return this.quanity;
    }
}       

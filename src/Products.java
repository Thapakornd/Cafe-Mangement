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
    
    Products(int i, int c, String n){
        this.productCost = c;
        this.productName = n;
        productID += 1;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusth
 */
public class Billing {
    
    private int totalCost = 0;
    static int billID = 0;
    private Products[] totalProducts;
    
    Billing(Products[] products){
        billID += 1;
        this.totalProducts = products;
    }
    
    public void getBill(){

    }
    
}

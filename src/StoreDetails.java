/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusth
 */

import java.util.ArrayList;

public class StoreDetails {
    
    private String SName;
    static int total = 0;
    public static ArrayList<Billing> totalBill = new ArrayList<>();
    
    StoreDetails(String n){
        this.SName = n;
    }
    
    public String getName(){
        return this.SName;
    }
    
    public Billing[] getBilling(){
        Billing[] temp = new Billing[totalBill.size()];
        temp = totalBill.toArray(temp);
        return temp;
    }
}

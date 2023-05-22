/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusth
 */
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import javax.swing.ImageIcon;

public class Billing implements Printable{
    
    static int billID = 0;
    private Products[] totalProducts;
    final static double vatSale = 0.07;
    
    Billing(Products[] products){
        billID += 1;
        this.totalProducts = products;
    }
    
    public double[] getTotal(){
        double totalCost = 0;
        
        for(Products p : this.totalProducts){
            totalCost += p.getCost();
        }
        
        System.out.println(this.totalProducts.length);
        
        double totalVat = Math.ceil(totalCost * vatSale);
        totalCost += totalVat;
        
        double[] total = {totalCost, totalVat};
        
        return total;
    }

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int r = totalProducts.length;
        int result = NO_SUCH_PAGE;
        ImageIcon icon = new ImageIcon("/Icon/coffee.png");
        
        if (pageIndex == 0){
            Graphics2D g2d = (Graphics2D) graphics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(), (int)pageFormat.getImageableY());
            
            try{
                int y=20;
                int yShift = 10;
                int headerRectHeight = 15;
                
                g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                g2d.drawString("-------------------------------------",12,y);y+=yShift;
                g2d.drawString("         Cafe testing Bar       ",12,y);y+=yShift;
                g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;

                g2d.drawString(" Item Name                  Price   ",10,y);y+=yShift;
                g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
                
                for(int s=0; s<r; s++){
                    g2d.drawString(" "+totalProducts[s].getName()+"                            ",10,y); y+=yShift;
                    g2d.drawString("      "+totalProducts[s].getQuanity()+" * "+totalProducts[s].getCost() / totalProducts[s].getQuanity(), 10, y);
                    g2d.drawString(" "+totalProducts[s].getCost(), 160, y); y += yShift;
                }
              
                g2d.drawString("-------------------------------------",10,y); y+= headerRectHeight;
                g2d.drawString("VAT 7% : "+ dashboard.df.format(getTotal()[1]), 10, y); y+=yShift;
                g2d.drawString("-------------------------------------",10,y); y+= yShift;
                g2d.drawString("Total amount : "+getTotal()[0], 10, y); y+=headerRectHeight; 
                
                g2d.drawString("*************************************",10,y); y += yShift;
                g2d.drawString("       THANK YOU COME AGAIN          ",10,y);y+=yShift;
                g2d.drawString("      SOFTWARE BY : THAPAKORN          ", 10, y);
            }catch(Exception e){
                
            }
            result = PAGE_EXISTS;
        }
        return result;
    }
    
}

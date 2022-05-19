/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

/**
 *
 * @author HI-TECH
 */
public class CurrDollars implements Payment{

    MonneyAdapter ad;
    
    
    @Override
    public double money(String type, double fees) {
if(type.equalsIgnoreCase("Dollar"))
       {  
           return (fees/16);
       }
       else if(type.equalsIgnoreCase("EgyPound"))
       {  
           ad=new MonneyAdapter(type);
           double value = ad.money(type, fees);
           return value;
       }
       else
       {
           return -1;
       }


           }
    
}

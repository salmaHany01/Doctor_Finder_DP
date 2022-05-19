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
public class MonneyAdapter implements Payment{
PaymentType typeOfpay;

    public MonneyAdapter(String type) {
        if(type.equalsIgnoreCase("EgyPound"))
        {
            typeOfpay=new CurrEgy();
        }
    }
  

    
    
    @Override
    public double money(String type, double fees) {
 if(type.equalsIgnoreCase("EgyPound"))
        {
            typeOfpay.setFees(fees);
            
           return typeOfpay.fees();
        }
        return 0;    }
    
    
}

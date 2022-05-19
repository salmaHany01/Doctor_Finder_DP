/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import adminPackage.DatabaseConnectionDoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HI-TECH
 */
public class CurrEgy implements PaymentType{

    
    
   
        public static double fees;
    public void setFees(double fees)
    {this.fees=fees;}

    @Override
    public double fees() {
return this.fees();
    }
    
        
    }
    


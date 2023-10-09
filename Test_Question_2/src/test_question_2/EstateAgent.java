/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_question_2;

/**
 *
 * @author totca
 */
public abstract class EstateAgent implements iEstateAgent{
   
    private String sAgentName;
    private double dbPropertySale;
    
    public EstateAgent(String sName, double price){
        sAgentName = sName;
        dbPropertySale = price;
    }
    
    public String getAgentName(){
        return sAgentName;
    }
    
    public double getPropertyPrice(){
        return dbPropertySale;
    }
    
    public double getAgentCommission(){
        return dbPropertySale * 0.20;
    }
}

    


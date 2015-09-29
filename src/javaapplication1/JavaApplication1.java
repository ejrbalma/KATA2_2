/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  //Integer [] vector = {7,1,3,1,5,6,8,9,100,7,7,-4};
 
    String [] vector = {"Ana","Juan","Pedro", "Lucia", "Ana","Juan","Pedro","Ana","Juan","Pedro"};
    
    Histogram mihisto = new Histogram(vector);

   
    
HashMap <String,Integer> histogram = mihisto.getHisto();
    

        
        
        for (String key : histogram.keySet()) {
            System.out.println(key + "-->"+ histogram.get(key));
        }
    
    
    
    
    
    
    }
}

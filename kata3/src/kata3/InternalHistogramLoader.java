/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import kata3.core.HistogramLoader;
import kata3.core.Histogram;

/**
 *
 * @author delSe
 */
public class InternalHistogramLoader implements HistogramLoader{
    
    private static final String[] data = new String[] {
        "gmail.com", "hotmail.com", "hotmail.com", "gmail.com", "ulpgc.es", "ulpgc.es", "gmail.com", "ule.es", "ule.es", "gmail.com", "ule.es", "ulpgc.es"
    };
    
    public Histogram load(){
        Histogram histogram = new Histogram();
        
        for(String region : data){
            histogram.add(region);
        }
        
        return histogram;
    }
    
}

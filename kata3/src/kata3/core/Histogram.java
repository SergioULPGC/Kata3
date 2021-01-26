/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3.core;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author delSe
 */
public class Histogram {
    private final Map<String, Integer> count = new HashMap<>();
    
    public String[] getKeys(){
        return count.keySet().toArray(new String[0]);
    }
    
    public int getCount(String key){
        return count.getOrDefault(key, 0);
    }
    
    public void add(String key){
        count.put(key, getCount(key)+1);
    }
}

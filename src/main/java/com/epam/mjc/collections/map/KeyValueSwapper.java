package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<String, Integer>();
        for (Entry<Integer, String> item : sourceMap.entrySet()) {
            if (res.containsKey(item.getValue())) {
                if ((int)res.get(item.getValue()) > (int)(item.getKey())) {
                    res.put(item.getValue(), item.getKey());
                }
            } else {
                res.put(item.getValue(), item.getKey());
            }
        }
        return res;
    }
    
}

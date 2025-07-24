package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] arr = sentence.toLowerCase().replace(",", "").replace(".","").split(" ");
        Map<String, Integer> m = new HashMap<String,Integer>();
        for (String s : arr) {
            m.put(s, m.getOrDefault(s, 0) + 1);
        }
        return m;

    }
    
}

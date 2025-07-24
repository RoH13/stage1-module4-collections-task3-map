package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] arr = sentence.toLowerCase().replace(",", "").replace(".","").split(" ");
        Map<String, Integer> m = new HashMap<String,Integer>();
        for (String s : arr) {
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        return m;

    }
   
}

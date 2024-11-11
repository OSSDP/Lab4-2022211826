package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution6 {

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
  
        List<Set<String>> companySets = new ArrayList<>();
        
     
        for (List<String> companies : favoriteCompanies) {
            companySets.add(new HashSet<>(companies));
        }
        
        List<Integer> ans = new ArrayList<>();
        int n = companySets.size();
    
        for (int i = 0; i < n; ++i) {
            boolean isSubset = false;
            for (int j = 0; j < n; ++j) {
                if (i != j && companySets.get(j).containsAll(companySets.get(i))) {
                    isSubset = true;
                    break;
                }
            }
            if (!isSubset) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}

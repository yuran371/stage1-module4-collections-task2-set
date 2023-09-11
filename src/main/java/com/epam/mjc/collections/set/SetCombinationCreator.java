package com.epam.mjc.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    	
    	HashSet<String> intersaction = new HashSet<String>(firstSet);
    	intersaction.retainAll(secondSet);
    	intersaction.removeAll(thirdSet);
    	HashSet<String> intersaction2 = new HashSet<String>(thirdSet);
    	intersaction2.removeAll(firstSet);
    	intersaction2.removeAll(secondSet);
    	intersaction.addAll(intersaction2);
		return intersaction;
    	
    	

    	
    	
    }
}

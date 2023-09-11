package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
    	int lb = lowerBound;
    	int ub = upperBound;
    	TreeSet<Integer> treeSet = new TreeSet<Integer>();
    	for (int i=0; i<sourceList.size(); i++) {
    	int el = sourceList.get(i)*sourceList.get(i);
    	if (lb<=el&&el<=ub) {
    		treeSet.add(el);		
    	}
    }
		return treeSet;
}
}
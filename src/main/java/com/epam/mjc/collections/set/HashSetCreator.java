package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
    	HashSet<Integer> si = new HashSet<Integer>();
    	for (int i=0; i<sourceList.size(); i++) {
    		int intFromSourceList = sourceList.get(i);
    	if (intFromSourceList%2==0) {
			while (intFromSourceList>=1) {
				if(intFromSourceList%2==0) {
					si.add(intFromSourceList);
					intFromSourceList/=2;
				} else {
					si.add(intFromSourceList);
					break;
				}
			}
    		} else {
				si.add(intFromSourceList);
				si.add(intFromSourceList*2);
    		}
    	}
    	return si;
    }
}

package com.revature;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	/**
	 * Implement the method below, then right click on
	 * SolutionTests.java within src/test/java/ -> com.revature to test your code
	 * before committing and pushing to your repository.
	 */
	
	public static int[] solution(int[] data, int n) {
		
		Map <Integer, Integer> dataCount = new LinkedHashMap<Integer, Integer>();
		
		for (int i : data) {
			if (!dataCount.containsKey(i)) {
				dataCount.put(i,1);
			} else {
				int val = dataCount.get(i);
				int newVal = ++val;
				dataCount.put(i,newVal);
			}
		}

		Set<Integer> dataKeys = dataCount.keySet();
		List<Integer> checkList = new ArrayList<Integer>();
		List<Integer> solutionList = new ArrayList<Integer>();
		
		for (int key : dataKeys) {
			int val = dataCount.get(key);
			System.out.println("val=" + val);
			System.out.println("n=" + n);
			if (val <= n) {
				checkList.add(key);
			}
		}

		for (Integer s : checkList) {
			for (int d : data) {
				if (d == s) {
					solutionList.add(d);
				}
			}
		}

		int[] solutionArray = solutionList.stream().mapToInt(sol -> sol).toArray();
		
		return solutionArray;
	}
}

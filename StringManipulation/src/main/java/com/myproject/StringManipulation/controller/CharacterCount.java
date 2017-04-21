package com.myproject.StringManipulation.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {

	Map<Character, Integer> counter = new HashMap<Character, Integer>();

	public void charCounter(String str){
		for(int i = 0; i<str.length();i++){
			if(counter.putIfAbsent(str.charAt(i),0) !=null){
				int updateValue = counter.get(str.charAt(i)) + 1;
				counter.put(str.charAt(i), updateValue);
			}
		}
		for (Entry<Character, Integer> entry : counter.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}

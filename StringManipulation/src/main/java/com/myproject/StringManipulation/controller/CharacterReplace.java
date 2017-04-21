package com.myproject.StringManipulation.controller;

public class CharacterReplace {

	public void replaceCharacter(String str, char a, char b) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a){
				sb.append(b);
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}

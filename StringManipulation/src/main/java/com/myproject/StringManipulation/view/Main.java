package com.myproject.StringManipulation.view;

import com.myproject.StringManipulation.controller.CharacterCount;
import com.myproject.StringManipulation.controller.CharacterReplace;

public class Main {

	public static void main(String[] args) {
		CharacterCount count = new CharacterCount();
		CharacterReplace replace = new CharacterReplace();
		
		count.charCounter("hflwauoiauwmrjnoasfmLUFFYTDYFU");
		replace.replaceCharacter("Hello world", 'l', 'r');
		
	}

}

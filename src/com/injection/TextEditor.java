package com.injection;

public class TextEditor {
	private SpellChecker spellChecker;
	private String string;
	private String string2;

	public TextEditor(SpellChecker spellChecker, String string, String string2) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
		this.string = string;
		this.string2 = string2;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		System.out.println("param string="+this.string + ",string2=" + this.string2);
	}
}

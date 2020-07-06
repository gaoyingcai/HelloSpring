package com.injection;

public class TextEditor2 {
	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}

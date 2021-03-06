package com.naroyo.libelles.fr;

import com.naroyo.libelles.Libelles;

public class LibellesFr implements Libelles {

	private static final String APPLICATION_NAME = "Time's Up !";
	private static final String BUTTON_PLAY_TEXT = "Jouer";
	private static final String NICOLAS_NAME = "Petit bouchon";
	private static final String HELENE_NAME = "Une fille pas comme les autres";
	private static final String AND = "et";

	@Override
	public String getApplicationName() {
		return APPLICATION_NAME;
	}

	@Override
	public String getButtonPlayText() {
		return BUTTON_PLAY_TEXT;
	}

	@Override
	public String getNicolasName() {
		return NICOLAS_NAME;
	}

	@Override
	public String getHeleneName() {
		return HELENE_NAME;
	}

	@Override
	public String getWordAnd() {
		return AND;
	}
}

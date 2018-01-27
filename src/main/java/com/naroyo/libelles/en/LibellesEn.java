package com.naroyo.libelles.en;

import com.naroyo.libelles.Libelles;

public class LibellesEn implements Libelles {

	private static final String APPLICATION_NAME = "Time's Up !";
	private static final String BUTTON_PLAY_TEXT = "Play";
	private static final String NICOLAS_NAME = "Petit bouchon";
	private static final String HELENE_NAME = "Une fille pas comme les autres";

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
}

package com.naroyo.libelles;

import com.naroyo.libelles.fr.LibellesFr;

public interface Libelles {
	public String getApplicationName();

	public String getButtonPlayText();

	public String getNicolasName();

	public String getHeleneName();

	/**
	 * Définition de la langue à utiliser.
	 * 
	 * @return La classe de libellé à utiliser.
	 */

	public static Libelles getLibelles() {
		return new LibellesFr();
	}

}

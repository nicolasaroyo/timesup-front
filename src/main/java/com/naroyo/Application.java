package com.naroyo;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;

import com.naroyo.libelles.Libelles;

@BindTemplate("templates/application.html")
public class Application extends ApplicationTemplate {
	public static void main(final String[] args) {
		final Application client = new Application();
		client.bind("application-content");
		// Templates.bind(new Fibonacci(), "fibonacci");
	}

	public String getPlayText() {
		return Libelles.getLibelles().getButtonPlayText();
	}
}

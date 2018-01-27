package com.naroyo.components;

import org.teavm.flavour.templates.BindElement;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.templates.Slot;
import org.teavm.flavour.widgets.AbstractWidget;

import com.naroyo.libelles.Libelles;

@BindTemplate("components/footer.html")
@BindElement(name = "footer")
public class FooterComponent extends AbstractWidget {
	public FooterComponent(final Slot slot) {
		super(slot);
	}

	public String getNicolas() {
		return Libelles.getLibelles().getNicolasName();
	}

	public String getHelene() {
		return Libelles.getLibelles().getHeleneName();
	}

	public String getWordAnd() {
		return Libelles.getLibelles().getWordAnd();
	}
}

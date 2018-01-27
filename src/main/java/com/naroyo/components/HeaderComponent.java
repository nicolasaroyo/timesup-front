package com.naroyo.components;

import org.teavm.flavour.templates.BindElement;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.templates.Slot;
import org.teavm.flavour.widgets.AbstractWidget;

import com.naroyo.libelles.Libelles;

@BindTemplate("components/header.html")
@BindElement(name = "header")
public class HeaderComponent extends AbstractWidget {
	public HeaderComponent(final Slot slot) {
		super(slot);
	}

	public String getApplicationName() {
		return Libelles.getLibelles().getApplicationName();
	}
}

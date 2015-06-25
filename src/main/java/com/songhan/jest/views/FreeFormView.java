package com.songhan.jest.views;

import io.dropwizard.views.View;

public class FreeFormView extends View {
	
	String what, from, to;
	
	public FreeFormView(String what, String from, String to) {
        super("free_form.ftl");
        this.what = what;
        this.from = from;
        this.to = to;
    }
	
	public String getWhat() {
		return what;
	}

    public String getFrom() {
        return from;
    }
    
    public String getTo() {
        return to;
    }
}

package com.gob.webapp.kpi.App;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Main extends HorizontalLayout {
	protected Button menuButton;
	protected CssLayout menu;
	protected Button dashboard;
	protected Button reports;
	protected Button customize;
	protected Button customize1;
	protected Button admin;
	protected Label viewTitle;
	protected CssLayout content;

	public Main() {
		Design.read(this);
	}
}

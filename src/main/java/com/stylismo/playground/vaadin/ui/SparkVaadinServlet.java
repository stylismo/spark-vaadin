package com.stylismo.playground.vaadin.ui;

import com.stylismo.playground.vaadin.ui.VaadinUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@VaadinServletConfiguration(ui = VaadinUI.class, productionMode = true)
public class SparkVaadinServlet extends VaadinServlet
{
}
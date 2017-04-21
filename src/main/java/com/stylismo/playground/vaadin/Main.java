package com.stylismo.playground.vaadin;

import com.stylismo.playground.vaadin.ui.SparkVaadinServlet;

import static spark.Spark.*;


public class Main {

    public static void main(String[] args) throws Exception {
        port(8080);

        servlet("/app/*", SparkVaadinServlet.class);
        servlet("/VAADIN/*", SparkVaadinServlet.class);

        init();
    }
}
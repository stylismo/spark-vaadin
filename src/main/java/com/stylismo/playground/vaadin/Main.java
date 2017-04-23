package com.stylismo.playground.vaadin;

import com.stylismo.playground.vaadin.ui.SparkVaadinServlet;

import static spark.Spark.*;


public class Main {
    public static final String DEFAULT_PORT = "8080";
    public static final String PORT = "server.port";

    public static void main(String[] args) throws Exception {
        port(getHerokuAssignedPort());

        servlet("/app/*", SparkVaadinServlet.class);
        servlet("/VAADIN/*", SparkVaadinServlet.class);

        init();
    }

    static int getHerokuAssignedPort() {
        return Integer.parseInt(System.getProperty(PORT, DEFAULT_PORT));
    }
}
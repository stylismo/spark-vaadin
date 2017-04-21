package com.stylismo.playground.vaadin.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import static com.vaadin.ui.Notification.Type.TRAY_NOTIFICATION;

@Theme("valo")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        Page.getCurrent().setTitle("Spark-Vaadin");

        HorizontalLayout layout = new HorizontalLayout();

        Label label = new Label("Hello Spark!");
        label.addStyleName(ValoTheme.LABEL_H1);

        layout.setSizeFull();
        layout.addComponent(label);
        layout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        setContent(layout);
        setSizeFull();

        Notification.show("Vaadin servlet deployed from Spark", TRAY_NOTIFICATION);
    }

}
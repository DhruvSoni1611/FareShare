package com.fareshare.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("dashboard") // Maps this view to the "/dashboard" URL
public class DashboardView extends VerticalLayout {

  public DashboardView() {
    // Add a welcome message
    H1 welcomeMessage = new H1("Welcome to Your Dashboard");

    // Add a button to navigate to the trips view
    Button tripsButton = new Button("View Trips", event -> {
      getUI().ifPresent(ui -> ui.navigate("trips"));
    });

    // Add components to the layout
    add(welcomeMessage, tripsButton);
    setSizeFull();
    setAlignItems(Alignment.CENTER);
    setJustifyContentMode(JustifyContentMode.CENTER);
  }
}
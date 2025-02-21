package com.fareshare.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("splash") // Maps this view to the "/splash" URL
@CssImport("./styles/splash-styles.css") // Custom CSS for the splash screen
public class SplashScreen extends VerticalLayout {

  public SplashScreen() {
    // Create a loader animation
    Div loader = new Div();
    loader.addClassName("loader");

    // Add a welcome message
    Html welcomeMessage = new Html("<h1>Welcome to FareShare</h1>");

    // Add components to the layout
    add(loader, welcomeMessage);
    setSizeFull();
    setAlignItems(Alignment.CENTER);
    setJustifyContentMode(JustifyContentMode.CENTER);

    // Redirect to the dashboard after 3 seconds
    UI.getCurrent().getPage().executeJs("setTimeout(function() { window.location.href = '/dashboard'; }, 3000);");
  }
}
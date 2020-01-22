package com.mfh.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    BorderPane rootBorderPane = new BorderPane();
    Label lblTest = new Label("test");
    stage.setTitle("Test");
    stage.setScene(new Scene(rootBorderPane));
    stage.setHeight(500);
    stage.setWidth(500);
    stage.setMinHeight(500);
    stage.setMinWidth(500);
    stage.show();
  }
}
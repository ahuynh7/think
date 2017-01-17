package tests;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Line[] line = new Line[4];
		Pane pane = new Pane();
		
		for (int i = 0; i < line.length; i++) {
			switch (i) {
				case 0:
					line[i] = new Line(201, 0, 201, 602);
					pane.getChildren().add(line[i]);
					
					break;
				case 1:
					line[i] = new Line(402, 0, 402, 602);
					pane.getChildren().add(line[i]);
					
					break;
				case 2:
					line[i] = new Line(0, 201, 602, 201);
					pane.getChildren().add(line[i]);
					
					break;
				case 3:
					line[i] = new Line(0, 402, 602, 402);
					pane.getChildren().add(line[i]);
					
					break;
			}
		}
		
		primaryStage.setTitle("THREEXTHREE");
		primaryStage.setScene(new Scene(pane, 592, 592));
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Rectangle shape = new Rectangle();
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 200, 200);
		
		shape.setX(50);
		shape.setY(50);
		shape.setWidth(75);
		shape.setHeight(75);
		shape.rotateProperty().bind(pane.widthProperty().subtract(20));
		shape.widthProperty().bind(pane.widthProperty().subtract(100));
		shape.heightProperty().bind(pane.heightProperty().subtract(100));
		shape.setStroke(Color.CRIMSON);
		shape.setFill(Color.LIGHTPINK);

		pane.getChildren().add(shape);

		primaryStage.setTitle("show");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

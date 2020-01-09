package dad.javafx.calendario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	private Controller controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();
		
		Scene  scene = new Scene(controller.getRoot(), 800, 600);
		
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image(getClass().getResource("/images/calendar-16x16.png").toString()));
		primaryStage.setTitle("Calendario");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}

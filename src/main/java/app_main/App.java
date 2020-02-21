package app_main;

import controller.ClienteController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private ClienteController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new ClienteController();
		
		Scene escena = new Scene(controller.getRoot());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("JavaFX Template Project Demo");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

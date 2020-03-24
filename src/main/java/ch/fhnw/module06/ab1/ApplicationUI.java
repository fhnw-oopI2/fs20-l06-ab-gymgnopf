package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {

	private Button button;
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	public void initializeControls() {
		button = new Button("Hello Wolrd");
	}
	public void layoutControls() {
		getChildren().add(button);
	}
}

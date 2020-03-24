package ch.fhnw.module06.ab2;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private TextField textField;
	private TextArea textArea;
	private Label label;
	private Button button;
	
	public ApplicationUI() {
		initControls();
		layoutControls();
	}
	
	public void initControls() {
		label = new Label("label");
		textField = new TextField("text field");
		textArea = new TextArea("text area");
		button = new Button("ein Button");
	}
	public void layoutControls() {
		setPadding(new Insets(10));
		getChildren().add(label);
		getChildren().add(textField);
		getChildren().add(textArea);
		getChildren().add(button);
	}
}

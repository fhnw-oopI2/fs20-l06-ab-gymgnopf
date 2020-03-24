package ch.fhnw.module06.ab3;





import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane  {
	
	private Button buttonLeft;
	private Button buttonRight;
	private Button buttonTop;
	private Button buttonBottom;
	private TextArea textArea;
	
	public ApplicationUI() {
		
		initControls();
		layoutControls();
	}

	
	public void initControls() {
		buttonLeft = new Button("left");
		buttonRight = new Button("right");
		buttonTop = new Button("top");
		buttonBottom = new Button("bottom");
		textArea = new TextArea("");
		
		buttonTop.setMaxWidth(400);
		buttonBottom.setMaxWidth(400);

		
	}
	public void layoutControls() {
		
		BorderPane.setMargin(buttonLeft, new Insets(0,5,0,5));
		BorderPane.setMargin(buttonRight, new Insets(0,5,0,5));
		BorderPane.setMargin(buttonTop, new Insets(5));
		BorderPane.setMargin(buttonBottom, new Insets(5));
		
		setTop(buttonTop);
		setBottom(buttonBottom);
		setLeft(buttonLeft);
		setRight(buttonRight);
		setCenter(textArea);
		
	
	}
}

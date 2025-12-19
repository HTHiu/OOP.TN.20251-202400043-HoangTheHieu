package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	private Color c = Color.BLACK;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }
    
    @FXML
    void usePen(ActionEvent event) {
    	c = Color.BLACK;
    }
    
    @FXML
    void useEraser(ActionEvent event) {
    	c = Color.WHITE;
    }
    
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

        Circle newCircle = new Circle(event.getX(), event.getY(), 4, c);
        drawingAreaPane.getChildren().add(newCircle);
    }
    
}
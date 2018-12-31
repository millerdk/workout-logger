package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ExerciseLogController {
    @FXML
    TextField exerciseTextField;
    @FXML
    VBox exerciseVBox;

    @FXML
    protected void addExercise(ActionEvent ae) throws Exception {

        String exercise = exerciseTextField.getText();

        Label exerciseLabel = new Label(exercise);
        VBox exerciseView = FXMLLoader.load(getClass().getClassLoader().getResource("ExerciseTable.fxml"));
        exerciseVBox.getChildren().addAll(exerciseLabel, exerciseView);

        exerciseTextField.setText("");
    }
}

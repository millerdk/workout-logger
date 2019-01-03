package controllers;

import factories.ExerciseTableFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import models.Exercise;

import java.util.List;


public class ExerciseLogController {
    @FXML
    TextField exerciseTextField;
    @FXML
    VBox exerciseVBox;

    List<Exercise> exercises;



    @FXML
    protected void addExercise(ActionEvent ae) throws Exception {

        String exerciseName = exerciseTextField.getText();
        Pane exerciseView = ExerciseTableFactory.createExerciseTable(exerciseName);

        //TODO: add this to the exercise table component
        Label exerciseLabel = new Label(exerciseName);
        exerciseVBox.getChildren().addAll(exerciseLabel, exerciseView);

        exerciseTextField.setText("");
    }
}

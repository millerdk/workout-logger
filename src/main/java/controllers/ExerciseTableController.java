package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.ExerciseSet;


public class ExerciseTableController {
    @FXML
    TableView<ExerciseSet> exerciseSetTableView;
    @FXML
    TextField weightTextField;
    @FXML
    TextField repsTextField;


    @FXML
    protected void addSet(ActionEvent ae) {
        Double weight = Double.parseDouble(weightTextField.getText());
        Integer reps = Integer.parseInt(repsTextField.getText());
        ExerciseSet set = new ExerciseSet(reps, weight);
        exerciseSetTableView.getItems().add(set);
        weightTextField.setText("");
        repsTextField.setText("");
    }
}

package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.Exercise;
import models.ExerciseSet;

//TODO: update name to ExerciseView*... more than table
public class ExerciseTableController {
    @FXML
    private TableView<ExerciseSet> exerciseSetTableView;
    @FXML
    private TextField weightTextField;
    @FXML
    private TextField repsTextField;
    @FXML
    private Label errorLabel;

    //TODO: hookup model to table
    private Exercise exercise;

    public ExerciseTableController(Exercise exercise) {
        this.exercise = exercise;
    }


    @FXML
    protected void addSet(ActionEvent ae) {
        Double weight;
        Integer reps;
        try {
            weight = Double.parseDouble(weightTextField.getText());
        } catch (NumberFormatException e) {
            errorLabel.setText("Please enter a number for the weight");
            return;
        }
        try {
            reps = Integer.parseInt(repsTextField.getText());
        } catch (NumberFormatException e) {
            errorLabel.setText("Please enter a whole number for the reps");
            return;
        }
        errorLabel.setText("");

        ExerciseSet set = new ExerciseSet(reps, weight);
        exerciseSetTableView.getItems().add(set);
        weightTextField.setText("");
        repsTextField.setText("");
    }
}

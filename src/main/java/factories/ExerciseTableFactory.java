package factories;

import controllers.ExerciseTableController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import models.Exercise;

import java.io.IOException;

public class ExerciseTableFactory {

    public static Pane createExerciseTable(String exerciseName) {
        FXMLLoader fxmlLoader = new FXMLLoader(ExerciseTableFactory.class.getClassLoader().getResource("ExerciseTable.fxml"));

        Exercise exercise = new Exercise(exerciseName);
        ExerciseTableController controller = new ExerciseTableController(exercise);
        fxmlLoader.setController(controller);

        VBox exerciseTable = null;
        try {
            exerciseTable = fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Failed to load exercise table for "+ exerciseName);
            System.out.println(e);
        }

        return exerciseTable;
    }

    public static Pane getExerciseTable(Exercise exercise) {
        //TODO: add implementation for preconfigured exercises
        return null;
    }
}

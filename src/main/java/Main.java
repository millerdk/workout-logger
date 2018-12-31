import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ExerciseLogView.fxml"));

        Scene scene = new Scene(root, 400, 600);

        stage.setTitle("Let's get to work!");
        stage.setScene(scene);
        stage.show();
    }
}
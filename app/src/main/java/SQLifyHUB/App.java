
package SQLifyHUB;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    public static Stage stage;

    @Override
    public void start(Stage primarystage) {
        try {
            stage = primarystage;
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/app.fxml")));
            Scene scene = new Scene(root);
            primarystage.setScene(scene);
            primarystage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stage.setScene(new Scene(pane));
    }

    public static void main(String[] args) {
        launch();

    }

}

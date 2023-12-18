
package SQLifyHUB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class App extends Application {
    
    private static Stage stage;
    
    public void start(Stage primarystage){
        try{
            stage = primarystage;
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/app.fxml"));
            Scene scene = new Scene(root);
            primarystage.setScene(scene);
            primarystage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}

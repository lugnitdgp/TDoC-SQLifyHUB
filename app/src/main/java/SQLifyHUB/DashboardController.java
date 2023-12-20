package SQLifyHUB;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.sql.SQLException;

public class DashboardController {

    @FXML
    private BorderPane dashboard;

    @FXML
    private VBox navigationbox;

    @FXML
    private Button home;

    @FXML
    private AnchorPane main;

    @FXML
    private Label username;

    @FXML
    private Button create;

    @FXML
    private Button logout;

    @FXML
    private Button role;

    @FXML
    void Home(MouseEvent event) throws IOException, SQLException {

    }

    @FXML
    void Logout(MouseEvent event) throws IOException {
        Login.connection = null;
        App main = new App();
        main.changeScene("/fxml/app.fxml");
    }

    @FXML
    void createTable(MouseEvent event) throws IOException, SQLException {

    }

    @FXML
    void createRole(MouseEvent e) throws IOException, SQLException {

    }

    @FXML
    void createDb(MouseEvent e) throws IOException, SQLException {

    }

}

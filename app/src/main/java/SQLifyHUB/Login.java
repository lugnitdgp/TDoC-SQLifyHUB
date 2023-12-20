package SQLifyHUB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login {
    public static Connection connection;

    @FXML
    private Button Connect;

    @FXML
    private TextField db_name;

    @FXML
    private TextField passkey;

    @FXML
    private TextField user;

    @FXML
    void ConnectDB(MouseEvent event) throws IOException {
        getConnection();
    }

    public void getConnection() throws IOException {
        App main = new App();
        String database = db_name.getText().toString();
        String username = user.getText().toString();
        String password = passkey.getText().toString();

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, username,
                    password);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.print("connection = ");
        System.out.println(connection);
        main.changeScene("/fxml/dashboard.fxml");
    }
}
package SQLifyHUB;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.imageio.IIOException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login {

    public static Connection connection;

    @FXML
    private Button Connect;

    @FXML
    private TextField db_name;

    @FXML
    private TextField pass;

    @FXML
    private TextField user;

    @FXML
    void connectDb(MouseEvent event) throws IOException {
        getConnection();
    }

    public void getConnection() throws IOException {
        App main = new App();

        // String database = db_name.getText().toString();
        // String username = user.getText().toString();
        // String password = pass.getText().toString();

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://db.zvescodssexpgvwswrxh.supabase.co:5432/postgres?user=postgres&password=Sounak@1dgp");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("connection:" + connection);
        main.changeScene("/fxml/dashboard.fxml");

    }

}

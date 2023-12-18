package SQLifyHUB;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Login {

    @FXML
    private Button Connect;

    @FXML
    private TextField db_name;

    @FXML
    private TextField passkey;

    @FXML
    private TextField user;

    @FXML
    void ConnectDB(MouseEvent event) {
        getConnection();
    }
    
    public void getConnection(){
        String database = db_name.getText().toString();
        String username = user.getText().toString();
        String password = passkey.getText().toString();
        
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+database, username, password);
        }catch(Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        System.out.print("connection = ");
        System.out.println(connection);
    }
}
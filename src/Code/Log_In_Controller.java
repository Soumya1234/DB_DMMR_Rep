package Code;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

import Exceptions.BlankFieldError;
import Support.Messages;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Log_In_Controller implements Initializable{
    @FXML
    private TextField root_user;
    @FXML
    private PasswordField root_password;
    @FXML
    private Button ok_button;
    
    @FXML
    private void handleOkButtonEvent (ActionEvent event)
    {
     try 
     {   
    	 if(root_user.getText().length()==0 || root_password.getText().length()==0) /* Checks to see if all Fields are filled*/
    	 {
    		 throw new BlankFieldError("Please enter Log In Credentials properly");
     	 }
    	 String RootUserName=root_user.getText();
    	 String RootPassword=root_password.getText();
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", RootUserName, RootPassword);
    	 prepare.execute(con);
    	 Messages.ShowInfoMessage("Database ready for Use", "Success");
     }
     catch(Exception e)
     {
    	 Messages.ShowErrorMessage(e.toString(),"Error");
     }
    	
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}

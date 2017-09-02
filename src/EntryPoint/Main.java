package EntryPoint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		try 
		{
			Parent root=FXMLLoader.load(getClass().getResource("/UI/Log In.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Log In to Prepare Database");
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/UI/ABC.png")));
			primaryStage.show();
		} 
		catch(Exception e) 
		{
		    e.printStackTrace();
		}	
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CommentMaker - by Natsu");
			primaryStage.show();
			primaryStage.getIcons().add(new Image("file:///C:/Users/Gunwa/eclipse-workspace/CommentMakerZ/src/kisspng-computer-icons-gear-clip-art-settings-ico-5ab0ec2ed82034.8505833715215442388853.jpg"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

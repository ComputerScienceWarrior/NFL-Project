import java.util.ArrayList;
import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MAIN extends Application {
	
	@Override
	public void start(Stage stage) {
		//create panes
		BorderPane mainPane = new BorderPane();//grid pane ot hold all other panes
		FlowPane buttonPane = new FlowPane();//pane to hold all buttons horizontally and add spacing
		VBox labelPane = new VBox();//pane to hold the labels on the start page
		VBox loginPane = new VBox();//pane to hold all login info
		
		//TOP PANE
		mainPane.setTop(labelPane);
		//BOTTOM PANE
		mainPane.setBottom(buttonPane);
		//CENTER PANE
		mainPane.setCenter(loginPane);
		//LEFT PANE
		
		//RIGHT PANE
		
		//create buttons
		Button start = new Button("Start");//button to begin application
		Button exit = new Button("Exit");//Button to end the application
		Button createAccount = new Button("Create Account");
		
		//create textfields
		TextField textLogin = new TextField();
		TextField textPassword = new TextField();
		
		//create labels
		Label welcome1 = new Label("Welcome to NFL Team Application.");//line 1 of the NFL welcome header
		Label welcome2 = new Label("Please select an option below.");//line 2 of the NFL welcome header
		Label login = new Label("Enter Username: ");
		Label password = new Label("Enter Password: ");
		
		//login information combined
		loginPane.getChildren().add(login);
		loginPane.getChildren().add(password);
		
		//add labels to vbox
		labelPane.getChildren().addAll(welcome1, welcome2);
		//add buttons to flowpane
		buttonPane.getChildren().addAll(start, exit);
		buttonPane.setHgap(50);
		
		
		//create the scene to add everything to
		Scene mainPage = new Scene(mainPane, 300, 300);
		stage.setScene(mainPage);//add scene to stage
		stage.setTitle("NFL Team Applciation");//create a title
		
		stage.show();//display title
		
	}

	public static void main(String[] args) {
		launch(args);	
	}
}

/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
   SECTION 03
   EXERCISE 01
 */
package assignments;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Scanner;


public class circles extends Application {
	 public static void main(String[] args)
	    {
	        Application.launch(args);
	    }
	 
	    @Override
	    public void start(Stage stage)
	    {
	    	System.out.print("Enter two differents variables: ");
	    	Scanner reader = new Scanner(System.in);
	    	int x = reader.nextInt();
			int y = reader.nextInt();
	        // Create the Circles
	        Circle circle1 = new Circle(0, 0, x);
	        circle1.setFill(Color.WHITE);
	        Circle circle2 = new Circle(y, y, x, Color.WHITE);
	        circle2.setStroke(Color.WHITE);
	        circle2.setStrokeWidth(2.0);
	 
	        // Create the HBox
	        HBox root = new HBox();
	        // Add the children to the HBox
	        root.getChildren().addAll(circle1, circle2);
	 
	        // Set Spacing of the HBox
	        root.setSpacing(10);
	        // Set Style for the HBox
	        root.setStyle
	        (
	            "-fx-padding: 10;" +
	            "-fx-border-style: solid inside;" +
	            "-fx-border-width: 2;" +
	            "-fx-border-insets: 5;" +
	            "-fx-border-radius: 5;" +
	            "-fx-border-color: blue;"
	        );
	 
	        // Create the Scene
	        Scene scene = new Scene(root);
	        // Add the Scene to the Stage
	        stage.setScene(scene);
	        // Set the Title of the Stage
	        stage.setTitle("A JavaFX Circle Example");
	        // Display the Stage
	        stage.show();
	        
	        reader.close();
	    }
	}

// https://examples.javacodegeeks.com/desktop-java/javafx/javafx-2d-shape-example/
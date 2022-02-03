/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
   SECTION 03
   EXERCISE 02
 */
package assignment;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;  
public class polygon extends Application {    
  
  public static void main(String[] args) {  
    launch(args);  
  }  
  
  @Override  
  public void start(Stage primarystage) {  
    Group lastpoints = new Group();  
    primarystage.setTitle("questiontwo");  
      
    Polygon polygon = new Polygon();  
    polygon.getPoints().addAll(new Double[]{ 400.0,220.0, 300.0,289.0,0.0,100.0,60.0,70.0,40.0,50.0,300.0,75.0 });  
    polygon.setStroke(Color.BLACK);
    polygon.setFill(Color.WHITE);
    polygon.setTranslateZ(2);
    lastpoints.getChildren().add(polygon);  
    Scene scene = new Scene(lastpoints,300,400);  
    primarystage.setScene(scene);  
    primarystage.show();  
  }
}

/** 
 * REFERENCES
 * 
 * https://docs.oracle.com/javafx/2/api/javafx/scene/package-summary.html
 */
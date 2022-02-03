/* MOHAMED MOUBARAK MOHAMED MISBAHOU MKOUBOI(1820705)
   SECTION 03
   EXERCISE 01
 */
package assignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circles extends Application {
    private static String intersection = "Two circles intersect? ";
    private static Label intersect;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Initialize the intersect Label
        intersect = new Label(intersection + "No");

        // Pane to hold the circles
        Pane circlePane = new Pane();
        circlePane.setPadding(new Insets(5));
        CircleObject circle1 = new CircleObject(52.0, 60.0, 30);
        CircleObject circle2 = new CircleObject(180.0, 56.0, 40);
        circlePane.getChildren().addAll(circle1, circle2);

        // Circle 1 info Pane
        Pane c1P = new Pane();
        CircleInfo Info1 = new CircleInfo("Enter circle 1 info: ",
            52.0, 60.0, 30);
        c1P.getChildren().add(Info1);

        // Circle 2 info Pane
        Pane c2P = new Pane();
        CircleInfo Info2 = new CircleInfo("Enter circle 2 info: ",
            180.0, 56.0, 40);
        c2P.getChildren().add(Info2);

        // HBox to hold the two circle info pane's
        HBox circleInfoHBox = new HBox(5);
        circleInfoHBox.setPadding(new Insets(5));
        circleInfoHBox.getChildren().addAll(c1P, c2P);

        // Redraw Circles button and set ActionEvent Handler
        Button redrawCircles = new Button("Redraw Circles");
        EventHandler<ActionEvent> handler = e -> {
            // Set circle1 variables
            circle1.setCenterX(Info1.getCenterX());
            circle1.setCenterY(Info1.getCenterY());
            circle1.setRadius(Info1.getRadius());

            // Set circle2 variables
            circle2.setCenterX(Info2.getCenterX());
            circle2.setCenterY(Info2.getCenterY());
            circle2.setRadius(Info2.getRadius());

            // Check to see if the circles intersect
            double circle1X = circle1.getCenterX();
            double circle1Y = circle1.getCenterY();
            double circle1Rad = circle1.getRadius();
            double circle2X = circle2.getCenterX();
            double circle2Y = circle2.getCenterY();
            double circle2Radius = circle2.getRadius();

            if (checkIntersection(circle1X, circle1Y, circle1Rad,
                    circle2X, circle2Y, circle2Radius)) {
                intersect.setText(intersection + "Yes");
            } else {
                intersect.setText(intersection + "No");
            }
        };
        redrawCircles.setOnAction(handler);
        Info1.getTfCenterX().setOnAction(handler);
        Info1.getTfCenterY().setOnAction(handler);
        Info1.getTfRadius().setOnAction(handler);
        Info2.getTfCenterX().setOnAction(handler);
        Info2.getTfCenterY().setOnAction(handler);
        Info2.getTfRadius().setOnAction(handler);

        // VBox to hold everything
        VBox pane = new VBox();
        pane.setPadding(new Insets(2));
        pane.setStyle("-fx-background-color: white");
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(intersect, circlePane, circleInfoHBox,
                redrawCircles);

        // Create a scene and add it to the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("IntersectingCircles"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /** Compares the two circles to make sure they don't intersect */
    public boolean checkIntersection(double c1X, double c1Y,
        double c1R, double c2X, double c2Y,
        double circle2Radius) {
        // x and y are the vertical and horizontal distances
        double x = c2X - c1X;
        double y = c2Y - c1Y;

        // Determine the straight-line distance between centers.
        double d = Math.sqrt((y * y) + (x * x));

        // Check Intersections
        if (d > (c1R + circle2Radius)) {
            // No Solution. Circles do not intersect
            return false;
        } else if (d < Math.abs(c1R - circle2Radius)) {
            // No Solution. one circle is contained in the other
            return false;
        } else {
            return true;
        }

    }

    /** Create a Circle object and set it's editable attributes */
    public class CircleObject extends Pane {
        // Data Fields
        private Circle circle;
        private double radius;
        private double cX;
        private double cY;
        private Paint fill;
        private Paint stroke;

        /** Create Default Constructor */
        public CircleObject () {
            // Set data fields
            this.cX = 52.0;
            this.cY = 60.0;
            this.radius = 30;

            // Paint the Circle
            paintCircle();
        }

        /** Create Secondary Constructor */
        public CircleObject (double centerX, double centerY, double radius) {
            // Set data fields
            this.cX = centerX;
            this.cY = centerY;
            this.radius = radius;
            this.fill = null;
            this.stroke = Color.BLACK;

            // Paint the Circle
            paintCircle();
        }

        /** Get centerX */
        public double getCenterX() {
            return this.cX;
        }

        /** Set centerX */
        public void setCenterX(double centerX) {
            this.cX = centerX;
            this.circle.setCenterX(this.cX);
        }

        /** Get centerY */
        public double getCenterY() {
            return this.cY;
        }

        /** Set centerY */
        public void setCenterY(double centerY) {
            this.cY = centerY;
            this.circle.setCenterY(this.cY);
        }

        /** Get radius */
        public double getRadius() {
            return this.radius;
        }

        /** Set radius */
        public void setRadius(double radius) {
            this.radius = radius;
            this.circle.setRadius(this.radius);
        }

        /** Get Fill */
        public Paint getFill() {
            return this.fill;
        }

        /** Set Fill */
        public void setFill(Paint fill) {
            this.fill = fill;
            this.circle.setFill(fill);
        }

        /** Get Stroke */
        public Paint getStroke() {
            return this.stroke;
        }

        /** Set Stroke */
        public void setStroke(Paint stroke) {
            this.stroke = stroke;
            this.circle.setStroke(this.stroke);
        }

        /** Paint the circle object */
        public void paintCircle() {
            // Create a circle object
            this.circle = new Circle();
            this.circle.setCenterX(this.cX);
            this.circle.setCenterY(this.cY);
            this.circle.setRadius(this.radius);
            this.circle.setFill(this.fill);
            this.circle.setStroke(this.stroke);
            getChildren().add(this.circle);
        }
    }

    /** Create a Circle info control VBox */
    public class CircleInfo extends VBox {
        // Data Fields
        private String circleLabel;
        private double centerX;
        private double centerY;
        private double radius;

        // Text Fields
        private TextField tfCenterX;
        private TextField tfCenterY;
        private TextField tfRadius;

        /** Default Constructor */
        public CircleInfo() {
            // Set Data Fields
            this.circleLabel = "Enter circle Info: ";
            this.centerX = 52.0;
            this.centerY = 60.0;
            this.radius = 30;

            // Paint the circleInfo VBox
            paintCircleInfo();
        }

        /** Create Secondary Constructor */
        public CircleInfo(String circleLabel, double centerX,
                          double centerY, double radius) {
            // Set Data Fields
            this.circleLabel = circleLabel;
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;

            // Paint the circleInfo VBox
            paintCircleInfo();
        }

        /** Get Center X */
        public double getCenterX() {
            return this.centerX = Double.parseDouble(tfCenterX.getText());
        }

        /** Set Center X */
        public void setCenterX(double centerX) {
            this.centerX = centerX;
            tfCenterX.setText(String.format("%.1f", this.centerX));
        }

        /** Get Center Y */
        public double getCenterY() {
            return this.centerY = Double.parseDouble(tfCenterY.getText());
        }

        /** Set Center Y */
        public void setCenterY(double centerY) {
            this.centerY = centerY;
            tfCenterY.setText(String.format("%.1f", this.centerY));
        }

        /** Get Radius */
        public double getRadius() {
            return this.radius = Double.parseDouble(tfRadius.getText());
        }

        /** Set Radius */
        public void setRadius(double radius) {
            this.radius = radius;
            tfRadius.setText(String.format("%.1f", this.radius));
        }

        /** Get tfCenterX */
        public TextField getTfCenterX() {
            return this.tfCenterX;
        }

        /** Get tfCenterY */
        public TextField getTfCenterY() {
            return this.tfCenterY;
        }

        /** Get tfRadius */
        public TextField getTfRadius() {
            return this.tfRadius;
        }

        /** Paint the circleInfo VBox */
        public void paintCircleInfo() {
            // Create TextFields
            this.tfCenterX = new TextField();
            this.tfCenterX.setPrefColumnCount(2);
            this.tfCenterX.setText(String.format("%.1f", this.centerX));
            this.tfCenterY = new TextField();
            this.tfCenterY.setPrefColumnCount(2);
            this.tfCenterY.setText(String.format("%.1f", this.centerY));
            this.tfRadius = new TextField();
            this.tfRadius.setPrefColumnCount(2);
            this.tfRadius.setText(String.format("%.1f", this.radius));

            // Create Labels, add TextFields, set content to the right
            Label lbInfo = new Label(circleLabel);
            lbInfo.setAlignment(Pos.CENTER);
            Label lbCenterX = new Label("Center x: ");
            lbCenterX.setAlignment(Pos.CENTER_LEFT);
            Label lbCenterY = new Label("Center y: ");
            lbCenterY.setAlignment(Pos.CENTER_LEFT);
            Label lbRadius = new Label("Radius: ");
            lbRadius.setAlignment(Pos.CENTER_LEFT);

            // Add TextField and corresponding Label elements to GridPane
            GridPane pane = new GridPane();
            pane.setHgap(5);
            pane.addRow(1, lbCenterX, tfCenterX);
            GridPane.setHalignment(tfCenterX, HPos.RIGHT);
            pane.addRow(2, lbCenterY, tfCenterY);
            GridPane.setHalignment(tfCenterY, HPos.RIGHT);
            pane.addRow(3, lbRadius, tfRadius);
            GridPane.setHalignment(tfRadius, HPos.RIGHT);

            // Add main label and GridPane to VBox
            this.setStyle("-fx-border-color: black");
            getChildren().addAll(lbInfo, pane);
        }
    }
}

/** 
 * REFERENCES
 * 
 * Created by John on 7/28/2014.
 */
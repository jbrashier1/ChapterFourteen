import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class DisplayImages extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        String imgRef1 = "File:images/FourRand/" + Integer.toString(((int) (Math.random() * 20)) + 1) + ".jpeg";
        Image image1 = new Image(imgRef1);
        String imgRef2 = "File:images/FourRand/" + Integer.toString(((int) (Math.random() * 20)) + 1) + ".jpeg";
        Image image2 = new Image(imgRef2);
        String imgRef3 = "File:images/FourRand/" + Integer.toString(((int) (Math.random() * 20)) + 1) + ".jpeg";
        Image image3 = new Image(imgRef3);
        String imgRef4 = "File:images/FourRand/" + Integer.toString(((int) (Math.random() * 20)) + 1) + ".jpeg";
        Image image4 = new Image(imgRef4);
        pane.add(new ImageView(image1), 0, 0);
        pane.add(new ImageView(image2), 1, 0);
        pane.add(new ImageView(image3), 0, 1);
        pane.add(new ImageView(image4), 1, 1);
        primaryStage.setTitle("Four Random Pics"); // Set the stage title
        Scene scene = new Scene(pane); // Place the GridPane in the scene
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

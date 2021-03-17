package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");
        Button b = new Button();
        TextField t = new TextField();
        VBox v = new VBox(b,t);
        b.setText("Say 'Hello World'");
        v.setSpacing(5);
        v.setAlignment(Pos.CENTER);
        v.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                t.setText("Hello World");
                t.setAlignment(Pos.CENTER);
                v.setBackground(new Background(new BackgroundFill(Color.INDIANRED, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });

        primaryStage.setScene(new Scene(v,300,300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

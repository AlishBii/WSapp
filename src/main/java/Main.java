import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("td.fxml"));
        primaryStage.setTitle("Pokemon generator");
        primaryStage.setScene(new Scene(root, 992, 400));
        /*InputStream in = Main.class.getClassLoader().getResourceAsStream(
                "src/main/java/scrappedData/pokemons.txt");*/
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
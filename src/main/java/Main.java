import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("td.fxml"));
        primaryStage.setTitle("POJO.Pokemon generator");
        primaryStage.setScene(new Scene(root, 992, 400));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
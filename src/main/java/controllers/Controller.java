package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button truthButton;

    @FXML
    private Button dareButton;

    @FXML
    private Label taskLabel;

    @FXML
    void initialize() {
        truthButton.setOnAction(e -> getTruth());
        //dareButton.setOnAction(e -> getTask());
    }

    public void getTruth(){
        String question = getRandomPokemon();
        taskLabel.setText(question);
    }



    public String getRandomPokemon(){
        ControllerMain cm = new ControllerMain();
        /*try {
            cm.scrap();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        ArrayList pokemons = new ArrayList();
        try {
            File file = new File("/Users/alisher/Desktop/last/wsa/src/main/java/scrappedData/pokemons.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String q = myReader.nextLine();
                pokemons.add(q);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        Random r = new Random();
        String pokemon = (pokemons.get(r.nextInt(pokemons.size())) + " ");
        return pokemon;
    }

    public void printOutAll() throws FileNotFoundException{
        File file = new File("");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()){

        }

    }
}

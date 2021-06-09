package controllers;

import POJO.Pokemon;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

public class ControllerMain {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TableView<Pokemon> table;
    @FXML
    private TableColumn<Pokemon, Integer> id;
    @FXML
    private TableColumn<Pokemon, String> name;
    @FXML
    private TableColumn<Pokemon, String> total;
    @FXML
    private TableColumn<Pokemon, String> hp;
    @FXML
    private TableColumn<Pokemon, String> attack;
    @FXML
    private TableColumn<Pokemon, String> defence;
    @FXML
    private TableColumn<Pokemon, String> spatk;
    @FXML
    private TableColumn<Pokemon, String> spdef;
    @FXML
    private TableColumn<Pokemon, String> speed;
    @FXML
    private TableColumn<Pokemon, String> type;

    public static ArrayList<Pokemon> pokemons = new ArrayList<>();
    public ControllerMain() {
    }

    @FXML
    void initialize() throws IOException {
        ControllerMain cm = new ControllerMain();
        cm.scrap();
        this.id.setCellValueFactory(new PropertyValueFactory("id"));
        this.name.setCellValueFactory(new PropertyValueFactory("name"));
        this.total.setCellValueFactory(new PropertyValueFactory("total"));
        this.hp.setCellValueFactory(new PropertyValueFactory("hp"));
        this.attack.setCellValueFactory(new PropertyValueFactory("attack"));
        this.defence.setCellValueFactory(new PropertyValueFactory("defence"));
        this.spatk.setCellValueFactory(new PropertyValueFactory("spAtk"));
        this.spdef.setCellValueFactory(new PropertyValueFactory("spDef"));
        this.speed.setCellValueFactory(new PropertyValueFactory("speed"));
        this.type.setCellValueFactory(new PropertyValueFactory("type"));
    }

    public void scrap() throws IOException {
        String url = "https://pokemondb.net/pokedex/all";
        Document document = Jsoup.connect("https://pokemondb.net/pokedex/all").timeout(6000).get();
        Elements elements = document.select("tbody");
        Iterator var4 = elements.select("tr").iterator();
        FileWriter writer = new FileWriter("src/main/java/scrappedData/pokemons.txt");
        while(var4.hasNext()) {
            Element el = (Element)var4.next();
            String name = el.select("td.cell-name a").text();
            String total = el.select("td.cell-total").text();
            String other = el.select("td.cell-num").text();
            int id = Integer.parseInt(other.substring(0, 3));
            String hp = other.substring(4, 6);
            String attack = other.substring(7, 9);
            String defence = other.substring(10, 12);
            String spAtk = other.substring(13, 15);
            String spDef = other.substring(16, 18);
            String speed = other.substring(19, other.length());
            String type = el.select("td.cell-icon").text();
            Pokemon pokemon = new Pokemon(id, name, total, hp, attack, defence, spAtk, spDef, speed, type);
            pokemons.add(pokemon);
            //System.out.println(pokemon);
            writer.write(pokemon.toString() + "\n");
            //System.out.println(pokemon);
        }

    }

    public static void main(String[] args) throws IOException {
        ControllerMain cm = new ControllerMain();
        cm.scrap();
        System.out.println(pokemons);
    }
}
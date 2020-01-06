package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class CartController implements Initializable {

    @FXML
    private TableView<Wish> table;

    @FXML
    public TableColumn<Wish, String> col_name;

    @FXML
    private TableColumn<Wish, Integer> col_price;
    
    @FXML
    private TableColumn<Wish, Image> col_image;
    
    @FXML
    private Text totalsum;
    
    Wish[] bought = new Wish[100];
    public static Integer quantity=0;
    
    public static final ObservableList<Wish> list = FXCollections.observableArrayList();
    public static void addToCart(ImageView image, String name, Integer no) {
    	list.add(new Wish(image, name,no));
    }
    public static void copyToCart(Wish product) {
    	list.add(product);
    }
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
	    col_name.setCellValueFactory(new PropertyValueFactory<Wish, String>("name"));
	    col_price.setCellValueFactory(new PropertyValueFactory<Wish, Integer>("price"));
	    col_image.setCellValueFactory(new PropertyValueFactory<Wish, Image>("image"));
	    table.setItems(list);
	    update();
	}
    public void update() {
	Integer i=0;
	Integer sum=0;
	Iterator iterator = list.iterator();
	while(iterator.hasNext()) {
    	Wish printme = list.get(i);
		System.out.print(printme.getPrice());
		sum+=printme.getPrice();
		i++;
	    Object next = iterator.next();
	}
	totalsum.setText("total: "+sum);
    }
	
	@FXML
	public void deleteEvent(ActionEvent e) {
        Wish selectedItem = table.getSelectionModel().getSelectedItem();
        table.getItems().remove(selectedItem);
        update();
	}
	@FXML
	public void buy(ActionEvent e) {
		Integer i=0;
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
	    	Wish buyme = list.get(i);
	        bought[quantity]=buyme;
	        quantity++;
			i++;
		    Object next = iterator.next();
		}
		table.getItems().removeAll(bought);
        update();
	}

}

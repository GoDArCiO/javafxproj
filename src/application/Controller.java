package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable {

	@FXML
	Button koszykO;
	@FXML AnchorPane holderPane;
	AnchorPane home;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createPage();
		
	}
	private void setNode(Node node) {
		holderPane.getChildren().clear();
		holderPane.getChildren().add((Node) node);
	}
	private void createPage() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/merchandise.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void createPage2() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/wishlist.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void createPage3() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/cart.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@FXML
	public void actionEvent(ActionEvent e) {
		System.out.print("imworking");
	}
	public void showMerchandise(ActionEvent e) {
		System.out.print("showing merch");
		createPage();
	}
	public void showWishList(ActionEvent e) {
		System.out.print("showWishList");
		createPage2();
	}
	public void showCart(ActionEvent e) {
		System.out.print("showCart");
		createPage3();
	}
	
}

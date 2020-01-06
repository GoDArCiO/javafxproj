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

public class ChoiceController implements Initializable {

	@FXML AnchorPane explorerPane;
	
	AnchorPane home;
	
	private void setNode(Node node) {
		explorerPane.getChildren().clear();
		explorerPane.getChildren().add((Node) node);
	}
	private void createPage() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/droids.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void createPage2() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/ships.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void createPage3() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/warriors.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@FXML
	public void actionEvent(ActionEvent e) {
		createPage();
	}
	@FXML
	public void actionEvent2(ActionEvent e) {
		createPage2();
	}
	public void actionEvent3(ActionEvent e) {
		createPage3();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

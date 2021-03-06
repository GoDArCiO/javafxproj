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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ShipsController implements Initializable {

	@FXML AnchorPane holderPane;
	
	AnchorPane home;
	
	int droidNo = 1;
	String str = "/application/ship" + droidNo + ".fxml";
	 
	private void setNode(Node node) {
		holderPane.getChildren().clear();
		holderPane.getChildren().add((Node) node);
	}
	private void createPage() {
		try {
			home = FXMLLoader.load(getClass().getResource("/application/ship1.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@FXML
	public void next(ActionEvent e) {
		try {
			droidNo++;
			if(droidNo>5)droidNo=1;
			str = "/application/ship" + droidNo + ".fxml";
			System.out.print(str);
			home = FXMLLoader.load(getClass().getResource(str));
			setNode(home);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@FXML
	public void prev(ActionEvent e) {
		try {
			droidNo--;
			if(droidNo<1)droidNo=5;
			str = "/application/ship" + droidNo + ".fxml";
			System.out.print(str);
			home = FXMLLoader.load(getClass().getResource(str));
			setNode(home);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void addToWishList(ActionEvent e) throws IOException {
		if(droidNo==1) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("xwing.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			WishListController.addToWishList(photo1,"Xwing", 75);
		}
		if(droidNo==2) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("tie.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			WishListController.addToWishList(photo1,"TieFighter", 7);
		}
		if(droidNo==3) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("falcon.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			WishListController.addToWishList(photo1,"Falcon", 750);
		}
		if(droidNo==4) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("stardestroyer.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			WishListController.addToWishList(photo1,"Stardestroyer", 1500);
		}
		if(droidNo==5) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("snowspeeder.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			WishListController.addToWishList(photo1,"Snowspeeder", 22);
		}
	}
	
	public void addToCart(ActionEvent e) throws IOException {
		if(droidNo==1) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("xwing.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			CartController.addToCart(photo1,"Xwing", 75);
		}
		if(droidNo==2) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("tie.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			CartController.addToCart(photo1,"TieFighter", 7);
		}
		if(droidNo==3) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("falcon.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			CartController.addToCart(photo1,"Falcon", 750);
		}
		if(droidNo==4) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("stardestroyer.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			CartController.addToCart(photo1,"Stardestroyer", 1500);
		}
		if(droidNo==5) {
			ImageView photo1 = new ImageView(new Image(this.getClass().getResourceAsStream("snowspeeder.png")));
			photo1.setFitHeight(200);
			photo1.setFitWidth(200);
			CartController.addToCart(photo1,"Snowspeeder", 22);
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createPage();
		
	}

}

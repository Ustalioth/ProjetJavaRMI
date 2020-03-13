package graphique;

import java.awt.Label;
import java.awt.event.MouseEvent;
import javafx.fxml.FXML;

public class controleurGrille {
	
//	FXMLLoader loader = new FXMLLoader();
//	URL xmlUrl = getClass().getResource("/mainScene.fxml");
//	loader.setLocation(xmlUrl);
//	Parent root = loader.load();
//
//	primaryStage.setScene(new Scene(root));
//	primaryStage.show();
	
	@FXML
	private GridPane grille;
	
	public GridPane getGrille() {
		return grille;
	}

	public void setGrille(GridPane grille) {
		this.grille = grille;
	}
	
	void detectionClic(GridPane g) {
		g.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
		    e.getX();
		    e.getY();
		});
	}
	
	 public void afficherSymbole(String symbol, int x, int y) {
		 grille.add(new Label(symbol), x, y);
	    }

	public controleurGrille(GridPane grille) {
		super();
		this.grille = grille;
	}
}

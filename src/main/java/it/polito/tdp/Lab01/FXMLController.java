package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private Button butCancella;
   
    @FXML
    private TextArea txtComunicazioni;

    @FXML
    void doInsert(ActionEvent event) {
    	String s = "";
    	elenco.addParola(txtParola.getText());
    	for (String stringa : elenco.getElenco()) {
    		s += stringa + "\n";
    	}
    	txtResult.setText(s);
    	txtParola.clear();
    	txtComunicazioni.appendText(System.nanoTime() + "\n");
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    	txtParola.clear();
    	txtComunicazioni.appendText(System.nanoTime() + "\n");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	if (elenco.getElenco().contains(txtParola.getText())) {
    		elenco.rimuoviParola(txtParola.getText());
    		txtParola.clear();
    		txtComunicazioni.appendText(System.nanoTime() + "\n");
    	}
    }
  
    
    
    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}

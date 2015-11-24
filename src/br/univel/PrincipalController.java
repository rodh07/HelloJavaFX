package br.univel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txFCodigo;

    @FXML
    private TextField txFNome;

    @FXML
    void Salvar(ActionEvent event) {
    	
    	String codigo = txFCodigo.getText();
    	String nome = txFNome.getText();
    	
    	System.out.println(codigo + "\t" + nome);

    }

    @FXML
    void initialize() {
        assert txFCodigo != null : "fx:id=\"txFCodigo\" was not injected: check your FXML file 'Principal.fxml'.";
        assert txFNome != null : "fx:id=\"txFNome\" was not injected: check your FXML file 'Principal.fxml'.";

    }
}

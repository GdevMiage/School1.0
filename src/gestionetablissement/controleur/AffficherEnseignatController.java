/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.controleur;

import gestionetablissement.GestionEtablissement;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author lyess
 */
public class AffficherEnseignatController implements Initializable {
private GestionEtablissement application;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
      public void setApp(GestionEtablissement application) throws FileNotFoundException{
        
        
      
     this.application = application;
      
    }
    
}

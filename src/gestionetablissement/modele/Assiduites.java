
package gestionetablissement.modele;

import java.util.Date;


public class Assiduites {
    
    
   private int idAssiduite;
   private Inscriptions inscription;
   private Seances seance;
   private String etatAssiduite;//a revoir avec type ennumere
   private Date datRelancAssiduite;
   private String commAssiduite;
   private String docAssiduite; //a revoir pdf

    public Assiduites(int idAssiduite, Inscriptions inscription, Seances seance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduite) {
        this.idAssiduite = idAssiduite;
        this.inscription = inscription;
        this.seance = seance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
    }

    public int getIdAssiduite() {
        return idAssiduite;
    }

    public void setIdAssiduite(int idAssiduite) {
        this.idAssiduite = idAssiduite;
    }


    public String getEtatAssiduite() {
        return etatAssiduite;
    }

    public void setEtatAssiduite(String etatAssiduite) {
        this.etatAssiduite = etatAssiduite;
    }

    public Date getDatRelancAssiduite() {
        return datRelancAssiduite;
    }

    public void setDatRelancAssiduite(Date datRelancAssiduite) {
        this.datRelancAssiduite = datRelancAssiduite;
    }

    public String getCommAssiduite() {
        return commAssiduite;
    }

    public void setCommAssiduite(String commAssiduite) {
        this.commAssiduite = commAssiduite;
    }

    public String getDocAssiduite() {
        return docAssiduite;
    }

    public void setDocAssiduite(String docAssiduite) {
        this.docAssiduite = docAssiduite;
    }
   
   
   
   
    
}

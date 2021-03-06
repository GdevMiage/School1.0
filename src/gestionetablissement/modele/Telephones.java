
package gestionetablissement.modele;


public class Telephones {
  private int idTelephone;
  private Individus individu; 
  private int mobileTelephone;
  private int fixeTelephone; 
  private String prenomContactTelephone;
  private String nomContactTelephone;
  private String mobileContactTelephone;
  private String fixeContactTelehone;
  private String lienContactTelephone;

    public Telephones(int idTelephone, Individus individu, int mobileTelephone, int fixeTelephone, String prenomContactTelephone, String nomContactTelephone, String mobileContactTelephone, String fixeContactTelehone, String lienContactTelephone) {
        this.idTelephone = idTelephone;
        this.individu = individu;
        this.mobileTelephone = mobileTelephone;
        this.fixeTelephone = fixeTelephone;
        this.prenomContactTelephone = prenomContactTelephone;
        this.nomContactTelephone = nomContactTelephone;
        this.mobileContactTelephone = mobileContactTelephone;
        this.fixeContactTelehone = fixeContactTelehone;
        this.lienContactTelephone = lienContactTelephone;
    }

    public int getIdTelephone() {
        return idTelephone;
    }

    public void setIdTelephone(int idTelephone) {
        this.idTelephone = idTelephone;
    }

    public Individus getIndividu() {
        return individu;
    }

    public void setIndividu(Individus individu) {
        this.individu = individu;
    }

 

    public int getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(int mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }

    public int getFixeTelephone() {
        return fixeTelephone;
    }

    public void setFixeTelephone(int fixeTelephone) {
        this.fixeTelephone = fixeTelephone;
    }

    public String getPrenomContactTelephone() {
        return prenomContactTelephone;
    }

    public void setPrenomContactTelephone(String prenomContactTelephone) {
        this.prenomContactTelephone = prenomContactTelephone;
    }

    public String getNomContactTelephone() {
        return nomContactTelephone;
    }

    public void setNomContactTelephone(String nomContactTelephone) {
        this.nomContactTelephone = nomContactTelephone;
    }

    public String getMobileContactTelephone() {
        return mobileContactTelephone;
    }

    public void setMobileContactTelephone(String mobileContactTelephone) {
        this.mobileContactTelephone = mobileContactTelephone;
    }

    public String getFixeContactTelehone() {
        return fixeContactTelehone;
    }

    public void setFixeContactTelehone(String fixeContactTelehone) {
        this.fixeContactTelehone = fixeContactTelehone;
    }

    public String getLienContactTelephone() {
        return lienContactTelephone;
    }

    public void setLienContactTelephone(String lienContactTelephone) {
        this.lienContactTelephone = lienContactTelephone;
    }
   
   
   
    
}

package models;

public class Personne {

    private String nom ; 
    private String prenom ;
    private String rue ;
    private String localite ; 
    private int NPA ;

    
    


    public Personne(String nom, String prenom, String rue, String localite, int nPA) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.localite = localite;
        NPA = nPA;
    }


    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public String getRue() {
        return rue;
    }


    public String getLocalite() {
        return localite;
    }


    public int getNPA() {
        return NPA;
    }
    
    

}

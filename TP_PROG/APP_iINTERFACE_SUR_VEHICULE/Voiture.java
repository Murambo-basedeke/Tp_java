

public class Voiture implements Vehicule {
    private int vitesseMax;
    public Voiture(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("le conducteur demarre la voiture ");
    }
    public void arreter(){
        System.out.println("le conducteur (moi) appuie le frein ce qui arrete la voiture ");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }
    
}

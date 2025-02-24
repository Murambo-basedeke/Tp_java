

public class Moto implements Vehicule {
    private int vitesseMax;
    public Moto(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("la moto est demarree par le motard");
    }
    public void arreter(){
        System.out.println("le motard freine");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }

    
}

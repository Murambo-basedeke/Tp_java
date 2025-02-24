

public class Velo implements Vehicule{
    private int vitesseMax;
    public Velo(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public int getVitesseMax(){
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax){
        this.vitesseMax=vitesseMax;
    }
    public void Demarrer(){
        System.out.println("le velo est pedale par le cycliste");
    }
    public void arreter(){
        System.out.println("le cycliste ne pedale plus");
    }
    public int VitesseMaxVehicule(){

        return  this.vitesseMax;
    }
}

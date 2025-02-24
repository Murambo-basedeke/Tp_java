

public class App {
    public static void main(String[] args) {
        Moto PremMoto =new Moto(180);
        Voiture PremVoiture=new Voiture(200);
        Velo velo_1 = new Velo(30);
       
       
        PremMoto.Demarrer();
        PremMoto.arreter();
        System.out.println("la vitesse maximale de la moto est "+PremMoto.VitesseMaxVehicule()+"Km/h");
        PremVoiture.Demarrer();
        PremVoiture.arreter();
        System.out.println(" la vitesse maximale de la voiture est "+PremVoiture.VitesseMaxVehicule()+"Km/h");
        velo_1.Demarrer();
        velo_1.arreter();
        System.out.println(" la vitesse maximale du velo est "+velo_1.VitesseMaxVehicule()+"Km/h");
       

    }
    
}

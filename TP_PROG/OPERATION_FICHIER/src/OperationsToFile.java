
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;

public class OperationsToFile {
    public static void main(String[] args) {
        File Fichierr = new File("texte.txt");
        File fichierr2 = new File("file.docs");

        try {

            FileReader fichierLecture = new FileReader(Fichierr);
            BufferedReader Fluxlecture = new BufferedReader(fichierLecture);

            FileWriter fichierEcriture = new FileWriter(fichierr2);
            BufferedWriter FluxEcriture = new BufferedWriter(fichierEcriture);

            int n;
            char[] osee = new char[1024];
            while ((n=Fluxlecture.read(osee)) != -1) {

                    String texte= new String(osee);
                    System.out.println(texte.toString());
            
                    FluxEcriture.write(osee,0, n);
                
            }
            FileWriter EffacahgeFile = new FileWriter(Fichierr);
            BufferedWriter Effacer = new BufferedWriter(EffacahgeFile);
            Effacer.write("", 0, n);
 
            FluxEcriture.close();
            Fluxlecture.close();
            Effacer.close();


            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Erreur "+e.getMessage());
        }
        
    }
    
}

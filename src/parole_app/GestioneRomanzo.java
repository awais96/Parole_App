/*
versione set
*/
package parole_app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author AWAIS
 */
public class GestioneRomanzo {

    private HashSet<String> set;
    private int paroleNumero = 0;

    public GestioneRomanzo() {
        set = new HashSet();
    }

    public int getParoleNumero() {
        return paroleNumero;
    }

    public void leggiFile(String filename) {
        File f = new File(filename);
        String[] romanzo;
        String riga;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while ((riga = br.readLine()) != null) {
                romanzo = riga.replace("-", " ").replace(".", " ").replace("?", " ").replace("\"", " ").replace(",", " ").replace("'", " ").replace("!", " ").replace(";", " ").replace("  ", " ").split(" ");
                for (int i = 0; i < romanzo.length; i++) {
                    set.add(romanzo[i]);
                    paroleNumero++;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("filenotfound ex");
        } catch (IOException ex) {
            System.out.println("input-output ex");
        }

    }

    public void stampa() {
        System.out.println(set.toString());
    }

}

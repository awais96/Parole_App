/*
 versione map
 */
package parole_app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author AWAIS
 */
public class GestioneRomanzo {

    private HashMap<String, Integer> hashmap;

    public GestioneRomanzo() {
        hashmap = new HashMap();
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
                    if (hashmap.containsKey(romanzo[i])) {
                        hashmap.put(romanzo[i], hashmap.get(romanzo[i]) + 1);
                    } else {
                        hashmap.put(romanzo[i], 1);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("filenotfound ex");
        } catch (IOException ex) {
            System.out.println("input-output ex");
        }

    }

    public void stampa() {
        System.out.println(hashmap.toString());
    }

}

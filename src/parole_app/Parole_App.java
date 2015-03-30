package parole_app;

/**
 *
 * @author AWAIS
 */
public class Parole_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestioneRomanzo gr = new GestioneRomanzo();
        gr.leggiFile(".//dati//romanzo.txt");
        System.out.println("romanzo testo:");
        gr.stampa();

    }

}

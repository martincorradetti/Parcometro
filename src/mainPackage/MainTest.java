package mainPackage;

public class MainTest {
    public static void main(String[] args) {
        boolean errorFound = false;

        // Creo una tariffa per la "ZonaA" con costoOrario di 1.5
        Tariffa t = new Tariffa("ZonaA", 1.5);

        // Creo un mainPackage con la mainPackage.Tariffa appena creata
        Parcometro p = new Parcometro(t);

        // Controllo le zone
        if (t.getZona() != p.getTariffa().getZona()) {
            errorFound = true;
            System.out.println("Errore");
        }

        // Chiedo al mainPackage di emettermi un mainPackage.Ticket per 2 ore
        int ore = 2;
        Ticket ticket = p.emettiTicket(ore);

        // Controllo che il costo totale sia corretto
        if(ore * t.getCostoOrario() != ticket.getCostoTotale()){
            errorFound = true;
            System.out.println("Errore");
        }

        // Controllo che le ore siano corrette
        if(ore != ticket.getOre()){
            errorFound = true;
            System.out.println("Errore");
        }

        if (!errorFound) {
            System.out.println("Tutto corretto per ora!");
        }
    }
}

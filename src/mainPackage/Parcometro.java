package mainPackage;

public class Parcometro {
    private Tariffa tariffa;
    public Parcometro(Tariffa tariffa) {
        this.tariffa = tariffa;
    }
    public Tariffa getTariffa() {
        return tariffa;
    }
    public Ticket emettiTicket(int ore) {
        Ticket ticket = new Ticket(ore);
        ticket.setCostoTotale(tariffa.getCostoOrario(), ore);
        return ticket;
    }
    @Override
    public String toString() {
        return "Il parcometro si trova in zona  " + tariffa.getZona() + " e il ticket ha un costo orario di " + tariffa.getCostoOrario() + "€";
    }
}

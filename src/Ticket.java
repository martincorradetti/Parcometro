public class Ticket {
    private double costoTotale;
    private Tariffa tariffa;
    private int ore;
    public Ticket(int ore) {
        this.ore = ore;
    }
    public void setCostoTotale(double costoOrario, int ore) {
        this.costoTotale = costoOrario * ore;
    }
    public double getCostoTotale() {
        return costoTotale;
    }
    public int getOre() {
        return ore;
    }
    @Override
    public String toString() {
        return "Il ticket ha una durata di "+ getOre() + " ore" + " e ha un costo totale di " + getCostoTotale() + "€";
    }
}


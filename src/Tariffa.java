public class Tariffa {
    private String zona;
    private double costoOrario;
    public Tariffa(String zona, double costoOrario) {
        this.zona = zona;
        this.costoOrario = costoOrario;
    }
    public String getZona() {
        return zona;
    }
    public double getCostoOrario() {
        return costoOrario;
    }
    @Override
    public String toString() {
        return "La tariffa della " + getZona() + " ha un costo orario di " + getCostoOrario() + "€" + " all'ora";
    }
}

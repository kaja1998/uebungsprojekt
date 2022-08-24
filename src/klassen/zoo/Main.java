package klassen.zoo;

public class Main {

    public static void main(String[] args) {
        Katze knighty = new Katze("knighty", 14, "Dachboden", null);
        //knighty.begruessung();
        //knighty.begruessung();
        Katze loki = new Katze("Loki", 10, null, null);
        //loki.begruessung();
        Katze baileys = new Katze("Baileys", 4, "Garten", null);
        //baileys.begruessung();
        knighty.setName("Bubu");
        //knighty.begruessung();
        knighty.setOrt("Kajas Zimmer");
        //knighty.begruessung();
        Esel hans = new Esel("Hans");
        //hans.vorstellen();
        String[] knightysnamen = { "Bubu", "Angelito", "Eulo" };
        knighty.setSpitznamen(knightysnamen);
        knighty.begruessung();
        knighty.mussKuemmern();
        knighty.spitznamenErweitern("Tausel");
        knighty.begruessung();

    }
}
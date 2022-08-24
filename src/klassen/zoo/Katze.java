package klassen.zoo;

import java.util.Arrays;

public class Katze {

    String name;
    int alter;
    String ort;
    String[] spitznamen;
    String gefuettert;

    public Katze(String name, int alter, String ort, String[] spitznamen) {
        this.name = name;
        this.alter = alter;
        this.ort = ort;
        this.spitznamen = spitznamen;
    }

    public void begruessung() {
        System.out.println("Hallo, mein Name ist " + this.name + " und ich bin " + this.alter + " Jahre alt.");
        if (this.ort != null) {
            System.out.println("Hier befinde ich mich: " + this.ort);
        } else {
            System.out.println("Ich weiss nicht wo ich bin");
        }
        System.out.println("Meine Spitznamen lauten " + Arrays.toString(spitznamen));
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}


    public String getOrt() {return this.ort;}
    public void setOrt(String ort) {this.ort = ort;}


    public String[] getSpitznamen() {return this.spitznamen;}
    public void setSpitznamen(String[] spitznamen) {this.spitznamen = spitznamen;}

    public void spitznamenErweitern(String neuerSpitzname) {
        int anzahlSpitznahmen = this.spitznamen.length + 1;
        String[] knightysSpitznamen2 = new String[anzahlSpitznahmen];
        for(int i = 0; i < this.spitznamen.length; i++) {
            knightysSpitznamen2[i] = this.spitznamen[i];
            }
        knightysSpitznamen2[anzahlSpitznahmen -1] = neuerSpitzname;
        this.spitznamen = knightysSpitznamen2;
}

    public String getGefuettert() {return this.gefuettert;}

    public void setGefuettert(String gefuettert) {this.gefuettert = gefuettert;}



    public void mussKuemmern() {

        boolean futterbekommen = Math.random() < 0.5;
        boolean liebe = Math.random() < 0.5;
        boolean spielen = Math.random() < 0.5;

        if (futterbekommen && liebe && spielen) {
            System.out.println("Ich brauche keine Zuwendung.");
        } else {
                System.out.println("Miau, miau, um mich wurde sich nicht gekuemmert!");
        }
    }
}

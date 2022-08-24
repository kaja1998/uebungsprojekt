package grundlagen.kontrollstrukturen.if_else;

public class Main {
    public static void main (String[] args) {

        // if else mit kurzer Schreibweise
        // -> Prüfung auf true
        public void mussKuemmern1 () {

            boolean futterbekommen = Math.random() < 0.5;
            boolean liebe = Math.random() < 0.5;
            boolean spielen = Math.random() < 0.5;

            if (futterbekommen && liebe && spielen) {
                System.out.println("Ich brauche keine Zuwendung.");
            } else {
                System.out.println("Miau, miau, um mich wurde sich nicht gekuemmert!");
            }
        }

        // if else mit langer Schreibweise
        // -> Prüfung auf true
        public void mussKuemmern2 () {

            boolean futterbekommen = Math.random() < 0.5;
            boolean liebe = Math.random() < 0.5;
            boolean spielen = Math.random() < 0.5;

            if (futterbekommen == true && liebe == true && spielen == true) {
                System.out.println("Ich brauche keine Zuwendung.");
            } else {
                System.out.println("Miau, miau, um mich wurde sich nicht gekuemmert!");
            }
        }

        // if else mit kurzer Schreibweise
        // -> Prüfung auf false
        public void mussKuemmern3 () {

            boolean futterbekommen = Math.random() < 0.5;
            boolean liebe = Math.random() < 0.5;
            boolean spielen = Math.random() < 0.5;

            if (!futterbekommen && !liebe && !spielen) {
                System.out.println("Ich brauche keine Zuwendung.");
            } else {
                System.out.println("Miau, miau, um mich wurde sich nicht gekuemmert!");
            }
        }
    }
}
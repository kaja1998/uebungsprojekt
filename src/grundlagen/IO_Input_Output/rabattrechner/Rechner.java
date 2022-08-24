package grundlagen.IO_Input_Output.rabattrechner;

import java.util.Scanner;

public class Rechner {
        public static void rabattrechner() {

        double einzelPreisVorRabatt;
        double rabatt;
        int artikelAnzahl;
        double gesamtPreisVorRabatt;
        double gesamtPreisNachRabatt;
        double gesamtErsparnis;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rabattrechner");
        System.out.println();
        System.out.println("Bitte geben Sie ein");
        System.out.println("Den Preis fuer einen Artikel:");
            einzelPreisVorRabatt = scanner.nextDouble();
        System.out.println("Rabatt (z.B. 0.50):");
            rabatt = scanner.nextDouble();
        System.out.println("Anzahl der Artikel:");
           artikelAnzahl = scanner.nextInt();

        scanner.close();

        gesamtPreisVorRabatt = einzelPreisVorRabatt * artikelAnzahl;
        gesamtPreisNachRabatt = gesamtPreisVorRabatt * rabatt;
        gesamtErsparnis = gesamtPreisVorRabatt - gesamtPreisNachRabatt;

        System.out.println(" Der Ursprungspreis alle Artikel zusammen beträgt: " + gesamtPreisVorRabatt + " € ");
        System.out.println(" Der Gesammtpreis mit abgezogenem Rabatt beträgt:" + gesamtPreisNachRabatt + " € ");
        System.out.println(" Mit Rabatt sparen Sie:" + gesamtErsparnis + " € ");
    }
}


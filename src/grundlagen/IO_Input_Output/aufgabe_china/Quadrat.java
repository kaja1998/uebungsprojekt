package grundlagen.IO_Input_Output.aufgabe_china;

import java.util.Scanner;

public class Quadrat {

    int width;
    int height;
    int n = width;
    String stern = "*";

    public static void QuadratRechner() {

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Rechteck-Rechner");
        System.out.println("==================");

        // Eingabe der Werte
        System.out.println("Bitte geben Sie die Breite ein:");
        int width = 10;//Eingabe.nextInt();
        System.out.println("Bitte geben Sie die Höhe ein:");
        int height = 5;//Eingabe.nextInt();

        // Verarbeitung
        if ((width>=1) && (width<=20)) {
            for (int i = 0; i < width; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        } else {
            System.out.println("Geben Sie einen Wert zwischen 1 und 20 ein");
        }
        if ((height>=1) && (height<=20)) {
            for (int i = 0; i < height; i++) {
                System.out.print("*");
                for (int j = 0; j < 1.85*width; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        } else {
            System.out.println("Geben Sie einen Wert zwischen 1 und 20 ein");
        }
        if ((width>=1) && (width<=20)) {
            for (int i = 0; i < width; i++) {
                System.out.print("* ");
            }
        } else {
            System.out.println("Geben Sie einen Wert zwischen 1 und 20 ein");
        }
        }
}

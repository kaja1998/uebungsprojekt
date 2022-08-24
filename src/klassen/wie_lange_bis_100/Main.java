package klassen.wie_lange_bis_100;

import java.time.LocalDateTime;

public class Main {

     // Instanzvariablen
    public static String name = "Kaja";
    public static int alter = 23;

    // String[] args ist ein Parameter
    public static void main(String[] args) {
        Main.begruessung("Kaja", 23);
        wielangebis100();
    }

    public static void begruessung(String name, int alter) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Hello " + name + "du bist" + alter + "Jahre alt");
        System.out.println("Nice to see you on the " + today);
    }

    public static void wielangebis100(int alter) {
        int age = 100 - alter;
        System.out.println( "Sie haben noch " + age + " Jahre, bis Sie 100 sind");
    }

    public static void wielangebis100() {
        int age = 100 - alter;
        System.out.println( "Sie haben noch" + age + "Jahre, bis Sie 100 sind");
    }

}
package klassen.hello_world;

public class Main {

    public static void main(String[] args) {
        String name = "Kaja";
        String job = "Arbeitslos";
        String life = "Syke";
        String zukunft = "UX-Design studieren";

        showgreeting(10);

        System.out.println("Ich heisse " + name + ". Ich bin derzeit " + job + " und wohne in " + life + ". Bald werde ich aber " + zukunft + ".");
    }

    public static void showgreeting(Integer hour) {
        if (hour < 12) {
            System.out.println("Guten Morgen!");
        } else {
            if (hour < 18) {
                System.out.println("Guten Tag!");
            } else {
                System.out.println("Guten Abend!");
            }
        }
    }
}
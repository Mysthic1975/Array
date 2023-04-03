import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char a = '+';
        char b = '#';
        char c = '%';
        char d = '-';
        char[] Zeichen;
        char[] NummerZwei = {a, b, c, d, 'a', 'b', 'c', 'd'};
        boolean Gleicheit = true;
        Scanner s = new Scanner(System.in);
        int Groesse;
        String st;

        System.out.println("Bitte gebe die größe deines Arrays an");
        while (!s.hasNextInt()) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Ganzzahl ein:");
            s.next();
        }
        Groesse = s.nextInt();
        Zeichen = new char[Groesse];

        for (int i = 0; i < Groesse; i++) {
            System.out.println("Hallo Benutzer gib deine " + i + " Zahl an");
            st = s.next();
            Zeichen[i] = st.charAt(0);
        }

        for (char zeichen : Zeichen) {
            System.out.println(zeichen);
        }

        int minGroesse = Math.min(NummerZwei.length, Groesse);
        for (int i = 0; i < minGroesse; i++) {
            if (NummerZwei[i] != Zeichen[i]) {
                System.out.println("Die Arrays sind nicht gleich, an der Stelle: " + i);
                Gleicheit = false;
            }
        }

        if (Gleicheit)
            System.out.println("Die Arrays sind gleich");

        char[] zuSuchendeZeichen = {'a', 'b', 'c', 'd'};
        for (char zeichen : zuSuchendeZeichen) {
            if (istZeichenImArrayEnthalten(Zeichen, zeichen)) {
                System.out.println("Das Zeichen " + zeichen + " ist im Array enthalten.");
            } else {
                System.out.println("Das Zeichen " + zeichen + " ist nicht im Array enthalten.");
            }
        }

        for (int i = 0; i < minGroesse; i++) {
            System.out.println(Zeichen[i] + " - " + NummerZwei[i]);
        }
    }

    public static boolean istZeichenImArrayEnthalten(char[] array, char zeichen) {
        for (char element : array) {
            if (element == zeichen) {
                return true;
            }
        }
        return false;
    }
}

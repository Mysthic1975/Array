import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        char[] Zeichen;
        char[] NummerZwei = {'+','#','%'};
        boolean Gleicheit = true;
        Scanner s = new Scanner(System.in);
        int Groesse;
        String st;

        System.out.println("Bitte gebe die größe deines Arrays an");
        Groesse = s.nextInt();
        Zeichen = new char[Groesse];

        for(int i =0; i < Groesse; i++)
        {
            System.out.println("Hallo Benutzer gib deine "+ i +" Zahl an");
            st = s.next();
            Zeichen[i]= st.charAt(0);
        }

        for(int i=0 ; i<Groesse ; i++) // i++ == i = i + 1 == i += 1
        {
            System.out.println(Zeichen[i]);
            //System.out.println(i);
        }

        int minGroesse = Math.min(NummerZwei.length, Groesse);
        for(int i=0;i<minGroesse;i++)
        {
            if(NummerZwei[i] != Zeichen[i])
            {
                System.out.println("Die Arrays sind nicht gleich, an der Stelle: " + i);
                Gleicheit = false;
            }
        }

        if(Gleicheit)
            System.out.println("Die Arrays sind gleich");

        // Erweiterung: Überprüfen Sie, ob ein vom Benutzer angegebenes Zeichen im Array vorhanden ist
        System.out.println("Bitte geben Sie ein Zeichen ein, um zu überprüfen, ob es im Array vorhanden ist:");
        char benutzerZeichen = s.next().charAt(0);
        boolean gefunden = false;
        int position = -1;

        for (int i = 0; i < Groesse; i++) {
            if (Zeichen[i] == benutzerZeichen) {
                gefunden = true;
                position = i;
                break;
            }
        }

        if (gefunden) {
            System.out.println("Das Zeichen " + benutzerZeichen + " wurde im Array an der Position " + position + " gefunden.");
        } else {
            System.out.println("Das Zeichen " + benutzerZeichen + " wurde nicht im Array gefunden.");
        }
    }
}
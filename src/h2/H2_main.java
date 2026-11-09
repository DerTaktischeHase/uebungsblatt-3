package h2;

public class H2_main {
    public static void main(String[] args) {
        int max; // Gibt an wie viel Personen maximal einen Fixplatz erhalten duerfen.
        int fix; // Gibt an, wie viele Personen bereits einen Fixplatz fuer die Veranstaltung erhalten haben.
        int wartend; // Gibt an wie viele Personen sich noch auf der Warteliste fuer einen Fixplatz befinden.
        boolean istVoll;


        //beispiel 1

        max = 5;
        fix = 2;
        wartend = 12;
        istVoll = false;

        while (!istVoll && wartend > 0) {
            if (fix >= max) {
                istVoll = true;
            } else {
                wartend--;
                fix ++;
            }
        }
        System.out.println("Aufgabe 1:\nMax: " + max + "; fix: " + fix + "; wartend: "
                + wartend + "; istVoll: " + istVoll + ";\n" + wartend
                + " Personen haben keinen Fixplatz bekommen.\n\n");

        // beispiel 2
        max = 5;
        fix = 2;
        wartend = 2;
        istVoll = false;

        while (!istVoll && wartend > 0) {
            if (fix >= max) {
                istVoll = true;
            } else {
                wartend--;
                fix ++;
            }
        }

        if (wartend > 0) {
            System.out.println("Aufgabe 2:\nMax: " + max + "; fix: " + fix + "; wartend: "
                    + wartend + "; istVoll: " + istVoll + ";\n" + wartend
                    + " Personen haben keinen Fixplatz bekommen.\n\n");
        } else {
            System.out.println("Aufgabe 2:\nMax: " + max + "; fix: " + fix + "; wartend: "
                    + wartend + "; istVoll: " + istVoll + ";\nJede und Jeder hat einen Fixplatz bekommen. :)\n\n");
        }
    }
}

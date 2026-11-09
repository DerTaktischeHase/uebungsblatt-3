package h4;

import java.util.Scanner;

public class P1_main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEingabe neuer Zahl: ");
        int wuerfel = scanner.nextInt();
        while (wuerfel != -1) {
            String win;

            switch (wuerfel) {
                case 1:
                    win = "Gewonnen!";
                    break;
                case 2:
                    win = "Verloren!";
                    break;
                case 3:
                    win = "Unklar!";
                    break;
                case 4:
                    win = "Gewonnen!";
                    break;
                case 5:
                    win = "Unentschieden!";
                    break;
                case 6:
                    win = "Unklar!";
                    break;
                default:
                    win = "unset";
                    break;
            }
            System.out.print("-> Ausgabe: " + win + "\n\nEingabe neuer Zahl: ");
            wuerfel = scanner.nextInt();
        }

    }
}

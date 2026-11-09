package h4;

import java.util.Random;

public class P1_1_main {
    public static void main (String[] args) {
        int wuerfel;
        int i = 0;
        while (i < 10) {
            wuerfel = random();
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
            System.out.print("-> Ausgabe: " + win + "\n");
            System.out.println("random: " + wuerfel);
            i++;
        }

    }

    public static int random() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}

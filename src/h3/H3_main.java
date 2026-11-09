package h3;

import java.util.Scanner;

public class H3_main {
    public static void main(String[] args) {
        int jahr = 2026;
        boolean schalt = false;

        if (jahr % 400 == 0) {
            schalt = true;
        } else if (jahr % 100 == 0) {
            schalt = false;
        } else if (jahr % 4 == 0) {
            schalt = true;
        } else {
            schalt = false;
        }
        if (schalt) {
            System.out.println(jahr + " ist ein Schaltjahr!");
        } else {
            System.out.println(jahr + " ist KEIN ein Schaltjahr!");
        }









        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben sie ein jahr ein: ");
        jahr = scanner.nextInt();

        if (jahr % 400 == 0) {
            schalt = true;
        } else if (jahr % 100 == 0) {
            schalt = false;
        } else if (jahr % 4 == 0) {
            schalt = true;
        } else {
            schalt = false;
        }
        if (schalt) {
            System.out.println(jahr + " ist ein Schaltjahr!");
        } else {
            System.out.println(jahr + " ist KEIN ein Schaltjahr!");
        }
    }
}

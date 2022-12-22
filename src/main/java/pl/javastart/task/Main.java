package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        boolean incorrectNumber;
        System.out.println("Zgadnij liczbę z przedziału [100, 200]");
        do {
            System.out.println("Podaj liczbę");
            userNumber = sc.nextInt();
            incorrectNumber = userNumber < 100 || userNumber > 200 || userNumber % 3 == 1 || userNumber % 3 == 2;
            if (userNumber < 100) {
                System.out.println("Podana liczba jest za mała.");
            } else if (userNumber > 200) {
                System.out.println("Podana liczba jest za duża.");
            } else if (userNumber % 3 == 1 || userNumber % 3 == 2) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
        } while (incorrectNumber);
        System.out.println("Twoja liczba jest ok.");
        sc.close();
    }
}
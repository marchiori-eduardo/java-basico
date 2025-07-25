package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();


        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d%n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name,email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");

        for (int i = 1; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}

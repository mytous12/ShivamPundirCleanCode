package org.example;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PrintStream printStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
        Scanner s = new Scanner(System.in);
        printStream.println("Enter 1 to calculate Simple or Compound Interest\n" +
                "Enter 2 to calculate House Construction cost\n" +
                "Enter 0 to exit");
        int choice = s.nextInt();

        Interest interest = new Interest(s.nextDouble(), s.nextDouble(), s.nextDouble());
        HouseConstruction houseConstruction = new HouseConstruction();
        switch (s.nextInt()) {
            case 1:
                printStream.println(interest.getSimpleInterest());
                break;
            case 2:
                printStream.println(interest.getCompoundInterest());
                break;
            default:
                throw new Exception("Invalid Input");
        }

        while (choice != 0) {
            if (choice == 1) {

            } else if (choice == 2) {
                houseConstruction.Function();
            } else {
                printStream.println("Plz Enter a valid choice");
            }
            printStream.println("Enter 1 to calculate Simple or Compound Interest\n" +
                    "Enter 2 to calculate House Construction cost\n" +
                    "Enter 0 to exit ");
            choice = s.nextInt();
        }

    }
}

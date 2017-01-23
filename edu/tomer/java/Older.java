package edu.tomer.java;

import java.util.Scanner;

/**
 * Created by hackeru on 23/01/2017.
 */
public class Older {
    void ex1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of grades...");
        int n = in.nextInt();

        int[] grades = new int[n];

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Enter the %d Grade\n", i + 1);
            grades[i] = in.nextInt();
            sum += grades[i];
        }
        double avg = sum / (n);
        System.out.printf("The avarage is %s%n", avg);


        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%3d", grades[i]);
        }
    }

    void ex2() {

        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] += numbers[i + 1];
        }
        System.out.println();
    }

    void contacts() {
        // write your code here
        Scanner in = new Scanner(System.in);

        String[] contacts = new String[100];
        String[] phones = new String[100];
        int contactCount = 0;

        int choice = -1;
        while (choice != 4) {
            System.out.println(
                    "Enter your choice:\n" +
                            "1)Add Contact\n" +
                            "2)Show all Contacts\n" +
                            "3)Delete Contact\n" +
                            "4)Quit"
            );
            choice = in.nextInt();

            if (choice == 1) {
                //Add Contact:
                System.out.println("Enter Name: ");
                contacts[contactCount] = in.next();
                System.out.println("Enter Phone: ");
                phones[contactCount] = in.next();
                contactCount++;
            } else if (choice == 2) {
                //Show contacts:
                for (int i = 0; i < contactCount; i++) {
                    String name = contacts[i];
                    String phone = phones[i];
                    System.out.printf("Name: %s, Phone: %s\n", name, phone);
                }
            } else if (choice == 3) {
                System.out.println("Enter Contact index:");
                int idx = in.nextInt();

                for (int i = idx; i < contactCount - 1; i++) {
                    contacts[i] = contacts[i + 1];
                    phones[i] = phones[i + 1];
                }
                contacts[contactCount] = null;
                phones[contactCount] = null;
                contactCount--;
            }
        }
    }

    void ex3() {
        Scanner in = new Scanner(System.in);

        int[] numbers = {1, 100, 10, 2, 60};
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                //(numbers[i] = 100, numbers[i+1] = 2
                if (numbers[i] > numbers[i + 1]) {
                    //Swap:
                    //temp = 100
                    int temp = numbers[i];
                    //numbers[i] = 2
                    numbers[i] = numbers[i + 1];
                    //numbers[i+1] = 100
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    void searchArray() {
        String[] names = {"Mike", "Mascha", "Tomer", "Bear", "Pooh"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name to search:");
        String choice = in.next();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(choice)) {
                System.out.println("Found: " + i);
                break;
            }
        }
    }

    void binarySearch(){
        Scanner in = new Scanner(System.in);
        int[] numbers = {4, 5, 6, 7, 8, 10, 13};

        System.out.println("Enter the number to search:");
        int query = in.nextInt();


        int first = 0;
        int last = numbers.length - 1;


        boolean found = false;
        while (first <= last && !found) {
            int middle = (first + last) / 2;
            if (numbers[middle] == query) {
                System.out.println("Found " + middle);
                found = true;
            } else if (numbers[middle] < query) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        if(!found)
            System.out.println("No such value");
    }
}

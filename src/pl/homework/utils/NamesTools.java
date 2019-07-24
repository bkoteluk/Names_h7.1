package pl.homework.utils;

import java.util.Scanner;

public class NamesTools {

    public String[] setArray() {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 5 imion :");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d: ", i + 1);
            names[i] = sc.nextLine();
        }
        sc.close();
        return names;
    }

    public void printHello(String[] names) {
        for (int i = names.length - 1; i >=0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }

}

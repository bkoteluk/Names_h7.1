package pl.homework.utils;

import pl.homework.lib.Names;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    public String[] setArray()
    {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String[] names = new String[5];

        System.out.println("Podaj 5 imion :");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d: ", i+1);
            names[i] = sc.nextLine();
        }
        sc.close();
        return names;
    }

    public void printArray(String[] names) {
        for (int i = names.length - 1; i >=0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }

}

package pl.homework.app;

import pl.homework.utils.NamesTools;

public class NamesTest {
    public static void main(String[] args) {
        String[] names = new String[5];
        NamesTools namesTools = new NamesTools();

        names = namesTools.setArray();
        namesTools.printHello(names);
    }
}

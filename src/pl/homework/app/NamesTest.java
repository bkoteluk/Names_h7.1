package pl.homework.app;

import pl.homework.lib.Names;
import pl.homework.utils.UserInterface;

public class NamesTest {
    public static void main(String[] args) {
        Names names = new Names();
        UserInterface ui = new UserInterface();

        names.setNames(ui.setArray());
        ui.printArray(names.getNames());
    }
}

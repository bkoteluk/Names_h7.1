package pl.homework.lib;

import java.util.Arrays;

public class Names {
    private String[] names;

    public Names() {
    }

    public Names(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Imiona :" + Arrays.toString(names);
    }

}

package ua.mamedov.module1;

public class Converter {
    String ch;
    int num;

    public Converter() {

    }

    public Converter(String ch, int num) {
        this.ch = ch;
        this.num = num;
    }

    public int converter(String character, int num) {
        int index;
        if (character.equalsIgnoreCase("a")) {
            index = num;
        } else if (character.equalsIgnoreCase("b")) {
            index = num + 8;
        } else if (character.equalsIgnoreCase("c")) {
            index = num + 16;
        } else if (character.equalsIgnoreCase("d")) {
            index = num + 24;
        } else if (character.equalsIgnoreCase("e")) {
            index = num + 32;
        } else if (character.equalsIgnoreCase("f")) {
            index = num + 40;
        } else if (character.equalsIgnoreCase("g")) {
            index = num + 48;
        } else if (character.equalsIgnoreCase("h")) {
            index = num + 56;
        } else {
            index = -1;
        }
        return index;
    }
}

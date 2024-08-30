package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder str = new StringBuilder("This animal is mostly ");
        str.append(color);
        str.append(". It has ");
        if (numberOfPaws == 1) {
            str.append(numberOfPaws);
            str.append(" paw and ");
        } else {
            str.append(numberOfPaws);
            str.append(" paws and ");
        }
        if (hasFur) {
            str.append("a fur.");
        } else {
            str.append("no fur.");
        }
        return str.toString();
    }
}

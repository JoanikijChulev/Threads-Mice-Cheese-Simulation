package org.example;

public class Box {
    String cell;
    String value;

    public String getValue() {
        return value;
    }

    public Box(String cell, String value) {
        this.cell = cell;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

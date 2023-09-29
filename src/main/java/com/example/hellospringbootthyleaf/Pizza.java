package com.example.hellospringbootthyleaf;

public class Pizza {

    private String name;
    private String ingridients;

    public Pizza(String name, String ingridients){
        this.name=name;
        this.ingridients=ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }
}

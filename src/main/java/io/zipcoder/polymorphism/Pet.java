package io.zipcoder.polymorphism;

public class Pet {
    private String speak;
    private String name;


    public Pet(){
//        this.speak = speak;
        this.name = "";
    }
    public String speak() {
        return speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

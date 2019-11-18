package io.zipcoder.polymorphism;

public class Dog  extends Pet{
    private   String name;
    private String speak;

    public Dog(){
        this.name = "Lio";
    }

    public String speak(){
        return "Bark";
    }

    public void setName(){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }
}
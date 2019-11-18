package io.zipcoder.polymorphism;

public class Bird  extends Pet{
    private   String name;
    private String speak;

    public Bird(){
        this.name= "Dove";
    }

    public String speak(){
        return "Tweet";
    }

    public void setName(){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }
}

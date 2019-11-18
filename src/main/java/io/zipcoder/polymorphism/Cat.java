package io.zipcoder.polymorphism;

public class Cat  extends Pet{
        private   String name = "";
       // private String speak;

        public Cat(String name){
            this.name= name;
        }



        public String speak(){
            return "Meoww";
        }

        public void setName(){
            this.name= name;
        }

        public String getName(){
            return this.name;
        }
}


package com.galvanize;



public class Fruit {

    // size is S M L
    private String size;

    // type
    private String type;

    //color
    private String fcolor;

    //GETs and SETs
    public void setSize (String size){
        this.size = size;
    }
    public String getSize (){
        return this.size;
    }

    public void setType (String type){
        this.type = type;
    }
    public String getType (){
        return this.type;
    }

    public void setFColor (String fcolor){
        this.size = fcolor;
    }
    public String getFColor (){
        return this.fcolor;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", fcolor='" + fcolor + '\'' +
                '}';
    }

    //constructor
    public Fruit(String size, String type, String fcolor){
        this.size = size;
        this.type = type;
        this.fcolor = fcolor;

    }
}

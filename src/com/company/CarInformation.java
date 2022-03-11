package com.company;

public class CarInformation {
    private int dateOfIssue;
    private String model;
    private int price;
    private String color;

    public CarInformation(){

    }
    public CarInformation(int dateOfIssue, String model, int price, String color){
        this.dateOfIssue = dateOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public int getDateOfIssue(){
        return dateOfIssue;
    }
    public void setDateOfIssue(int dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    public  String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "\nCar Information: " + "\ndateIssue: " + dateOfIssue + "\nmodel: " + model + "\nprice: " + price + "\ncolor: " + color;
    }
}

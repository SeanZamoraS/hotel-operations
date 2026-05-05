package com.pluralsight;

public class Room
{
    private String roomType;
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //constructors
    public Room(String roomType, int numberOfBeds, double price)
    {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    //getters
    public String getRoomType() {return this.roomType;}
    public int getNumberOfBeds() {return this.numberOfBeds;}
    public double getPrice() {return this.price;}
    public boolean isOccupied() {return this.isOccupied;}
    public boolean isDirty() {return this.isDirty;}

    public boolean isAvailable() {if(isOccupied || isDirty) {return false;}
    else {return true;}}

    //setters
    public void setOccupied(boolean isOccupied) {this.isOccupied = isOccupied;}
    public void setDirty(boolean isDirty) {this.isDirty = isDirty;}


}
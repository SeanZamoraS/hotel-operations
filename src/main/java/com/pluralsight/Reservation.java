package com.pluralsight;

import java.time.*;

public class Reservation
{
    String roomType;
    int numberOfNights;
    boolean isWeekend;

    Room room;
    LocalDate startDate;

    //constructors
    public Reservation(String roomType, int numberOfNights, boolean isWeekend)
    {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public Reservation(String roomType, int numberOfNights, boolean isWeekend, Room room)
    {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.room = room;
    }

    //getters
    public String getRoomType() {return this.roomType;}
    public int getNumberOfNights() {return this.numberOfNights;}
    public boolean isWeekend() {return this.isWeekend;}

    public double getPrice() {return this.room.getPrice();}
    public double getReservationTotal() {double price = this.room.getPrice() * this.numberOfNights;
    if(this.isWeekend) {return price * 1.3;} else{return price;}}

    //setters
    public void setRoomType(String roomType) {this.roomType = roomType;}
    public void setNumberOfNights(int numberOfNights) {this.numberOfNights = numberOfNights;}
    public void setWeekend (boolean isWeekend) {this.isWeekend = isWeekend;}

    public void setDate (String year, String month, String day)
    {
        String fullDate = year + "-" + month + "-" + day;

    }

}
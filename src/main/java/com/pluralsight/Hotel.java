package com.pluralsight;

public class Hotel
{
    String name;
    private final int numberOfSuites;
    private final int numberOfRooms;
    private int numberOfBookedSuites;
    private int numberOfBookedRooms;

    //constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int numberOfBookedSuites,
                 int numberOfBookedRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBookedSuites = numberOfBookedSuites;
        this.numberOfBookedRooms = numberOfBookedRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms)
    {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    //getters
    public String getName() {return this.name;}
    public int getNumberOfSuites() {return this.numberOfSuites;}
    public int getNumberOfRooms() {return this.numberOfRooms;}
    public int getNumberOfBookedSuites() {return this.numberOfBookedSuites;}
    public int getNumberOfBookedRooms() {return this.numberOfBookedRooms;}

    public int getAvailableRooms() {return this.numberOfRooms - this.numberOfBookedRooms;}
    public int getAvailableSuites() {return this.numberOfSuites - this.numberOfBookedSuites;}

    //methods
    public boolean bookRooms(int roomAmount, boolean isSuite)
    {
        if (isSuite && getAvailableSuites() > roomAmount)
        {
            this.numberOfBookedSuites =- roomAmount;
            return true;
        }

        else if ((!isSuite) && getAvailableRooms() > roomAmount)
        {
            this.numberOfBookedRooms =- roomAmount;
            return true;
        }

        else
        {
            System.out.println("Not enough of that type of room.");
            return false;
        }
    }

}
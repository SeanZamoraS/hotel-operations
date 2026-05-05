package com.pluralsight;

import java.time.*;

public class Employee
{
    int employeeID;
    String name;
    String department;
    double payRate;
    double hoursWorked;

    boolean workedOvertime;
    boolean isClockedIn = false;
    LocalDateTime clockInTime;

    //constructors
    public Employee(int employeeID, String name, String department, double payRate)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    //getters
    public int getEmployeeID() {return employeeID;}
    public String getName() {return name;}
    public String getDepartment() {return department;}
    public double getPayRate() {return payRate;}
    public double getHoursWorked() {return hoursWorked;}

    public double getRegularHours()
    {
        if (this.hoursWorked > 40.0)
        {
            return this.payRate * 40;
        }

        else
        {
            return this.hoursWorked * this.payRate;
        }
    }
    public double getOverTimeHours()
    {
        if (this.workedOvertime)
        {
            double extraHours = this.hoursWorked - 40;

            return extraHours * (payRate * 1.5);
        }
        else
        {
            return 0;
        }
    }
    public double getTotalPay()
    {
        return getOverTimeHours() + getRegularHours();
    }

    //setters
    public void setEmployeeID(int employeeID) {this.employeeID = employeeID;}
    public void setName(String name) {this.name = name;}
    public void setDepartment(String department) {this.department = department;}
    public void setPayRate(double payRate) {this.payRate = payRate;}
    public void setHoursWorked(double hoursWorked) {this.hoursWorked = hoursWorked;
        if (this.hoursWorked <= 40) {this.workedOvertime = false;} else {this.workedOvertime = true;}}

    //methods

    public void punchTimeCard() //in order to save after program closes, maybe implement filereader/writer?
    {
        this.isClockedIn = !this.isClockedIn;

        //LocalDateTime clockIn;
        if (this.isClockedIn)
        {
            LocalDateTime clockIn = LocalDateTime.now();
            this.clockInTime = clockIn;
        }

        else
        {
            LocalDateTime clockOut = LocalDateTime.now();

            Duration shiftTime = Duration.between(this.clockInTime, clockOut);
            double minutesShiftTime = shiftTime.toMinutes();
            double hoursShiftTime = minutesShiftTime/60;

            double roundedShiftTime = (double) Math.round(hoursShiftTime * 1000) /1000;
            this.hoursWorked = hoursWorked + roundedShiftTime;
        }
    }


}


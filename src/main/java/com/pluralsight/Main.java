package com.pluralsight;

public class Main
{
    public static void main()
    {
        employeeTest();
        roomTest();
    }

    public static void employeeTest()
    {
        Employee jimmy = new Employee(22, "Jimmy Bobson", "Customer Relations", 29.80);

        jimmy.setHoursWorked(35.98);

        double totalPay = jimmy.getTotalPay();
        double overTime = jimmy.getOverTimeHours();
        double regularTime = jimmy.getRegularHours();

        System.out.printf("%.2f, %.2f, %.2f\n", totalPay, regularTime, overTime);
    }

    public static void roomTest()
    {
        Room room123 = new Room("Standard", 2, 79);
        room123.setOccupied(false);
        room123.setDirty(false);

        System.out.println(room123.isAvailable());

        Reservation johnnyReservation = new Reservation("Standard", 3, true, room123);
        double total = johnnyReservation.getReservationTotal();

        System.out.println(total);


    }
}
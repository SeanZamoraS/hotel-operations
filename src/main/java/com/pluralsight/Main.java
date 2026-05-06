package com.pluralsight;
import java.util.*;

public class Main
{
    static Scanner input = new Scanner(System.in);
    static Employee jimmy = new Employee(22, "Jimmy Bobson", "Customer Relations", 29.80);

    public static void main()
    {
        //employeeTest();
        //roomTest();
        //clockTest();
        //clockTest2();
        hotelTest();
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

    public static void clockTest()
    {
        System.out.println("Press enter to clock in");
        input.nextLine();
        jimmy.punchTimeCard();

        System.out.println("Press enter to clock out");
        input.nextLine();
        jimmy.punchTimeCard();

        System.out.println(jimmy.getHoursWorked());

    }

    public static void clockTest2()
    {
        jimmy.punchTimeCard(23, 2);
        System.out.println(jimmy.getHoursWorked());
    }

    public static void hotelTest()
    {
        Hotel hotel = new Hotel("Bob's Hotel", 10, 20);

        //hotel.bookRooms(5, false);

        System.out.println(hotel.bookRooms(5, false));
        System.out.println(hotel.getAvailableRooms());
        System.out.println(hotel.getAvailableSuites());

    }




}
package com.mycompany.lab05ex05;
import java.util.Scanner;

public class Lab05Ex05 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMinutes = 0; 
        int days = 7; 
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i + ":");
            System.out.print("Enter start time (format (HH MM)): ");
            int startHour = scanner.nextInt();
            int startMinute = scanner.nextInt();
            System.out.print("Enter end time (format (HH MM)): ");
            int endHour = scanner.nextInt();
            int endMinute = scanner.nextInt();
            // CALCULATING start and end times to minutes 
            int startTimeInMinutes = startHour * 60 + startMinute;
            int endTimeInMinutes = endHour * 60 + endMinute;
            // CalculatING time spent for this task (in minutes)
            int timeSpent = endTimeInMinutes - startTimeInMinutes;
            totalMinutes += timeSpent;}
        // Converting total time from minutes to hours and minutes
        int totalHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        System.out.println("Total time spent in the week: " + totalHours + " hours and " + remainingMinutes + " minutes.");
        if (totalHours < 40) {
            System.out.println("Warning: You have spent less than 40 hours on tasks this week."); }}}

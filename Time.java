package com.company;

import java.util.Scanner;

public class Time {
    Scanner Scan=new Scanner(System.in);
    int availableHours;
    int From_clock;
    int To_clock;
    int Booked;
    void EnterDataTime()
    {
        System.out.println("availableHours :");
        availableHours=Scan.nextInt();
        System.out.println("From_clock :");
        From_clock=Scan.nextInt();
        System.out.println("To_clock :");
        To_clock=Scan.nextInt();
    }
    void DisplayTime()
    {
        System.out.println("availableHours :"+availableHours);
        System.out.println("From_clock :"+From_clock);
        System.out.println("To_clock :"+To_clock);

    }
}

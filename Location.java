package com.company;

import java.util.Scanner;

public class Location {
        Scanner Scan=new Scanner(System.in);
        int NumberOfStreet=0;
        String Street="";
        String City="";
        String Governorate="";
        void EnterDataLocation()
        {
            System.out.println("NumberOfStreet :");
            NumberOfStreet=Scan.nextInt();
            System.out.println("Street :");
            Street=Scan.next();
            System.out.println("City :");
            City=Scan.next();
            System.out.println("Governorate :");
            Governorate=Scan.next();
        }
        void DisPlayLocation()
        {
            System.out.println("NumberOfStreet :"+NumberOfStreet);
            System.out.println("Street :"+Street);
            System.out.println("City :"+City);
            System.out.println("Governorate :"+Governorate);


        }

}

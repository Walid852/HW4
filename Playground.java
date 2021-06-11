package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Playground extends Time {
    Scanner Scan=new Scanner(System.in);
    int id=0;
    static int SSn=0;
    String name;
    Location location=new Location();
    int Size;
    Time timeWork=new Time();
    int PricePerHours;
    String  KindOfGrass;
    ArrayList<Time> TimeListForRequest= new ArrayList<Time>();
    ArrayList<Requestes>  Books=new ArrayList<Requestes>();
    OperationPlayground Operation_for_Playground;
    public void AddPLayGround()
   {
       id=++SSn;
       Operation_for_Playground=OperationPlayground.SuspendPlayground;
       System.out.println("Please Enter All Information For Playground");
       System.out.println("Name :");
       name=Scan.next();
       System.out.println("Size :");
       Size=Scan.nextInt();
       System.out.println("PricePerHours :");
       PricePerHours=Scan.nextInt();
       System.out.println("KindOfGrass :");
       KindOfGrass=Scan.next();
       System.out.println("timeWork :");
       timeWork.EnterDataTime();
       System.out.println("All Details For Location");
       location.EnterDataLocation();
   }
   public void DisplayPlayground()
   {
       System.out.println("All Information For Playground");
       System.out.println("-----------------------------------------");
       System.out.println("id : "+id);
       System.out.println("Name : "+name);
       System.out.println("Size : "+Size);
       System.out.println("PricePerHours : "+PricePerHours);
       System.out.println("KindOfGrass :"+KindOfGrass);
       timeWork.DisplayTime();
       System.out.println("All Details For Location");
       location.DisPlayLocation();
   }
   void CalculateSlot()
   {
       timeWork.availableHours= timeWork.To_clock-timeWork.From_clock;
    for(int i=From_clock+1;i<timeWork.availableHours;i++)
        {
            Time Slot=new Time();
            Slot.From_clock=i;
            Slot.To_clock=i+1;
            TimeListForRequest.add(Slot);

        }
   }
   void viewAllEmptyhours()
   {
       for (Time N : TimeListForRequest) {
           System.out.println("From_clock:" +N.From_clock);
           System.out.println("To_clock:" +N.To_clock);
           System.out.println("Booked:" +N. Booked);
       }
   }
   void ViewplaygroundBooking()
   {
       for (Time N : TimeListForRequest) {
           if(N.Booked==1) {
               System.out.println("From_clock:" + N.From_clock);
               System.out.println("To_clock:" + N.To_clock);
               System.out.println("Booked:" + N.Booked);
           }
       }
   }
}

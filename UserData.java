package com.company;


import java.util.Scanner;

public class UserData extends Player{
    Scanner Scan=new Scanner(System.in);
    String Name;
    long ID;
    long Phone;
    String Email;
    String Password;
    Location DefaultLocation;
    UserType type_of_user;
    void EnterData(String Type)
    {
        System.out.println("Please Enter All Information");
        if(Type.equalsIgnoreCase("player"))
        {type_of_user=UserType.Player;}
        else if(Type.equalsIgnoreCase("playgroundOwner") ) {type_of_user=UserType.PlaygroundOwner;}
        System.out.println("Name :");
        Name=Scan.next();
        System.out.println("ID :");
        ID=Scan.nextLong();
        System.out.println("Phone :");
        Phone=Scan.nextLong();
        System.out.println("Email :");
        Email=Scan.next();
        System.out.println("Password :");
        Password=Scan.next();
        System.out.println("All Details For Location");
        DefaultLocation=new Location();
        DefaultLocation.EnterDataLocation();

    }
}

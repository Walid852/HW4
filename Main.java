package com.company;

import java.util.Scanner;

public class Main {
    static void MenuPlayGrountOwner() {
        System.out.println("1-Create New account");
        System.out.println("2-Add New Playground");
        System.out.println("3-viewAllEmptyhours");
        System.out.println("4-Exist");
        System.out.println("Please Choose you Want to do");
    }

    static void MenuPlayer() {
        System.out.println("1-Create New account");
        System.out.println("2-viewAllPlayground");
        System.out.println("3-Add New request");
        System.out.println("4-Exist");
        System.out.println("Please Choose you Want to do");
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        DataStorage system = new DataStorage();
        UserData Person = new UserData();
        while (true) {
            System.out.println("Enter Who Are You [Player--PlaygroundOwner]");
            String type = Scan.next();
            if (type.equalsIgnoreCase("Player")) {
                while (true) {
                    MenuPlayer();
                    int Choose = Scan.nextInt();
                    if (Choose == 1) {
                        Player player = new Player();
                        player.data = Person;
                        Person.EnterData("Player");
                        type = Person.type_of_user.toString();
                        system.ListOfPerson.add(Person);
                    }

                    if (Choose == 2) {
                        system.DisplayAllPlayground();
                    }
                    if (Choose == 3) {
                        int I;
                        System.out.println("please Enter id for playground you want");
                        I = Scan.nextInt();
                        Playground playground = system.ChoosePlayground(I);
                        System.out.println(playground);
                        Person.AddNewRequest(Person.Name, playground);
                    }
                    if (Choose == 4) {
                        break;
                    }
                }

            }
            if (type.equalsIgnoreCase("PlaygroundOwner")) {
                while (true) {
                    Playground Playground = new Playground();
                    PlaygroundOwner playgroundowner = new PlaygroundOwner();
                    MenuPlayGrountOwner();
                    int Choose = Scan.nextInt();
                    if (Choose == 1) {
                        Person.EnterData("PlaygroundOwner");
                        playgroundowner.data = Person;
                        system.ListOfPerson.add(Person);
                    }
                    if (Choose == 2) {
                        Playground.AddPLayGround();
                        Playground.CalculateSlot();
                        system.ListOfPlayground.add(Playground);
                        playgroundowner.PlaygroundList.add(Playground);
                        Administrator Admin = new Administrator();
                        Admin.ActivePlayground(Playground);
                    }
                    if (Choose == 3) {
                        Playground.viewAllEmptyhours();
                    }
                    if (Choose == 4) {
                        break;
                    }
                }
            }

        }
    }
}


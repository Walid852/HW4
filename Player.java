package com.company;

import java.util.ArrayList;

public class Player  {
    UserData data;
    ArrayList<Requestes> requests;
    ArrayList<Requestes> Books;
    public
    Playground SearchByLocation(Location location) {
        return null;
    }
    Playground SearchByPrice(int Price) {
        return null;
    }
    Playground SearchByTime(Time time) {
        return null;
    }
    void AddNewRequest(String Player,Playground playground)
    {
        playground.viewAllEmptyhours();
        Requestes NewRequest=new Requestes();
        Time time=new Time();
        time.EnterDataTime();
        NewRequest.player=Player;
        NewRequest.playground=playground.name;
        NewRequest.time=time;
        NewRequest.status=RequestStatus.pendingRequest;
        playground.Books.add(NewRequest);
        System.out.println("Request is become pendingRequest");
    }


}

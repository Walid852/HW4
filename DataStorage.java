package com.company;

import java.util.ArrayList;

public class DataStorage {
    ArrayList<UserData> ListOfPerson=new ArrayList<UserData>();
    ArrayList<Playground> ListOfPlayground=new ArrayList<Playground>();
    void DisplayAllPlayground()
    {
        for (Playground N : ListOfPlayground)
        {
            N.DisplayPlayground();
        }
    }
    Playground ChoosePlayground(int id)
    {
        return ListOfPlayground.get(Playground.SSn=id);
    }

}

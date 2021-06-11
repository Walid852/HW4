package com.company;

public class Administrator {
   UserData data;
   public void DeletePlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.DeletePlayground;
   }
   public void ActivePlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.ActivePlayground;
   }
   public void SuspendPlayground(Playground playground)
   {
       playground.Operation_for_Playground=OperationPlayground.SuspendPlayground;
   }
}

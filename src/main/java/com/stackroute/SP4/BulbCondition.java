package com.stackroute.SP4;

 class BulbCondition implements SwitchCondition {
     public void onBulb()
     {
         System.out.println("Bulb is on");
     }
     public void offBulb()
     {
         System.out.println("Bulb is off");
     }
}

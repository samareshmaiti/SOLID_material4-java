package com.stackroute.SP4;
import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) {
        System.out.println("Enter choice:\t 1.Bulb On\t 2.Bulb Off");
        int choice=scan.nextInt();
        BulbCondition bulbCondition=new BulbCondition();

            switch (choice) {
                case 1:
                    bulbCondition.onBulb();
                    break;
                case 2:
                    bulbCondition.offBulb();
                    break;
            }
        }
    }
}

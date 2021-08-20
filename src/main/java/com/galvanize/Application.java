package com.galvanize;

import java.time.LocalDateTime;

public class Application {

    public static void main(String [] args) {

        Picture myPicture = new Picture(10,20);
        //myPicture.setFramed(true);
        System.out.println(myPicture.isFramed());

        /*classes example
            Fruit banana = new Fruit("M", "banana", "yellow");

            System.out.println(banana.toString());
*/

        /*constructor example
        class Order {
            private String orderNumber;
            private String name;
            private LocalDateTime createdDate;

            //your code goes here, do not change any existing code
            public Order (String orderNumber, String name){
                this.orderNumber=orderNumber;
                this.name=name;
                this.createdDate=LocalDateTime.now();
            }
            public String getOrderNumber() {
                return orderNumber;
            }

            public String getName() {
                return name;
            }

            public LocalDateTime getCreatedDate() {
                return createdDate;
            }
        }*/



        /*creating the BankAccount class
        class BankAccount {

            long balance;

            void setAccountBalance (long cents, String transType) {
                if (transType.toString() == "W"){balance = balance-cents;}
                else if (transType.toString() == "D"){balance = balance+cents;}
            }
            void withdraw (long cents) {
                setAccountBalance(cents, "W");
            }
            void deposit (long cents){
                setAccountBalance(cents, "D");
            }
            public long balance(){
                return balance;
            }
            public Boolean isOverDrawn(){
                if (balance >= 0) {return false;}
                else {return true;}
            }
        }
*/








        /*
        //args[0];
        //args[1];
        if (args.length > 0) {
            System.out.println(String.format("Hello %s", args[0]));
        }
        else{
            System.out.println(String.format("No args!"));
        }*/






        /*JAR build
        public class SomeProgram {
            public static void main(String[] args) {

                String firstArgument = args[0];   // arg1
                String secondArgument = args[1];  // arg2
            }
        }*/


        /*boolean even = true;
        for (int i = 2; i <= 6; i++) {
            // This will print even numbers 2-6

            if (even) {System.out.println(i);}
            if (even) {even=false;}else{even=true;}
        }*/

        //System.out.println(Application.grade(59));

        /*While loop
        int x = 45;

        while (x <= 50) {
            System.out.println(x);
            x = x+1;
        }*/
    }

    /*grade method
    static String grade(int input){
        String myGrade = "";
        if (input >= 90){
            myGrade = "A";

        }
        if (input < 90 & input >= 80){
            myGrade = "B";

        }
        if (input < 80 & input >= 70){
            myGrade = "C";

        }
        if (input < 70 & input >= 60){
            myGrade = "D";

        }
        if (input < 60){
            myGrade = "F";

        }
        return myGrade;
    }*/
}

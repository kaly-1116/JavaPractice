package com.java.statements;

public class SwitchStatements {

    public static void main(String[] args) {

        weekDay("MONDAY");
        daysOfWeek(1);
        daysOfWeek(2);
        daysOfWeek(8);

    }

    public static void daysOfWeek(int weekDay) {

        switch (weekDay) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }

        }
    }

        public static void weekDay (String weekDay){

            switch (weekDay.toLowerCase()) {
                case "monday": {
                    System.out.println(1);
                    break;
                }
                case "Tuesday": {
                    System.out.println("Tuesday");
                    break;
                }
                case "Wednesday": {
                    System.out.println("Wednesday");
                    break;
                }
                default: {
                    System.out.println(" Enter vid day of the week");
                }
            }

        }

}
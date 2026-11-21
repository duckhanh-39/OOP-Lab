package Lab01;

import java.util.Scanner;

public class Exercise6_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year, month, days;
        while (true){
            System.out.print("Enter month: ");
            String inputMonth = sc.nextLine().toLowerCase();
            switch (inputMonth) {
                case "1": case "jan" : case "jan." : case "january":
                    month = 1;
                    break;           
                case "2": case "feb" : case "feb." : case "february":
                    month = 2;
                    break;
                case "3": case "mar" : case "mar." : case "march":
                    month = 3;
                    break;                
                case "4": case "apr" : case "apr." : case "april":
                    month = 4;
                    break;                
                case "5": case "may":
                    month = 5;
                    break;            
                case "6": case "jun" : case "jun." : case "june":
                    month = 6;
                    break;            
                case "7": case "jul" : case "jul." : case "july":
                    month = 7;
                    break;           
                case "8": case "aug" : case "aug." : case "august":
                    month = 8;
                    break;               
                case "9": case "sep" : case "sep." : case "september":
                    month = 9;
                    break;
                case "10": case "oct" : case "oct." : case "october":
                    month = 10;
                    break;
                case "11": case "nov" : case "nov." : case "november":
                    month = 11;
                    break;
                case "12": case "dec" : case "dec." : case "december":
                    month = 12;
                    break;
                default:
                    System.out.println("Invalid month!");
                    continue;
            }
            break;
        }
        
        while (true){
            System.out.print("Enter year: ");
            int inputYear = sc.nextInt();
            if (inputYear >= 0){
                year = inputYear;
                break;
            }
            else {
                System.out.println("Invalid year!");
            }
        }

        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) isLeap = true;

        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
                days = 31;
                break;
            case 4 : case 6 : case 9 : case 11:
                days = 30;
                break;
            case 2:
                if (isLeap) days = 29;
                else days = 28;
                break;
            default:
                days = 0;
        }
        System.out.println("Number of days: " + days);
        sc.close();
    }
}

package Lab01;

import java.util.Scanner;

public class Exercise2_2_6 {
    public static void solveLinear(double a, double b){
        if (a == 0){
            if (b == 0){
                System.out.println("Infinite solutions.");
            }
            else System.out.println("No solutions.");
        }
        else {
            double x = -b / a;
            System.out.println("Solutions: x = " + x);
        }
    }

    public static void solveLinearSystem(
            double a11, double a12, double b1, 
            double a21, double a22, double b2){
        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D != 0){
            double x1 = D1/D;
            double x2 = D2/D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (D1 == 0 && D2 == 0){
            System.out.println("Infinite Solutions.");
        }
        else {
            System.out.println("No solutions.");
        }
    }

    public static void solveQuadratic(double a, double b, double c){
        if (a == 0){
            solveLinear(b, c);
            return;
        }
        double delta = b*b - 4*a*c;
        if (delta < 0){
            System.out.println("No solution.");
        }
        else if (delta == 0){
            double x = -b/(2*a);
            System.out.println("x = " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Linear equation");
        System.out.println("2. Linear system");
        System.out.println("3. Quadratic equation");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter a, b: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                solveLinear(a, b);
                break;
            
            case 2:
                System.out.print("Enter a11, a12, b1: ");
                double a11 = scanner.nextDouble();
                double a12 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.print("Enter a21, a22, b2: ");
                double a21 = scanner.nextDouble();
                double a22 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                solveLinearSystem(a11, a12, b1, a21, a22, b2);
                break;

            case 3:
                System.out.print("Enter a, b, c: ");
                double qa = scanner.nextDouble();
                double qb = scanner.nextDouble();
                double qc = scanner.nextDouble();
                solveQuadratic(qa, qb, qc);
                break;

            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

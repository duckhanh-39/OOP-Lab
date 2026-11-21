package Lab01;

import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        double[][] a = new double[m][n];
        double[][] b = new double[m][n];
        double[][] c = new double[m][n];
        System.out.println("Enter matrix A: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) a[i][j] = sc.nextDouble();
        }
        System.out.println("Enter matrix B: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) b[i][j] = sc.nextDouble();
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) c[i][j] = a[i][j] + b[i][j];
        }
        System.out.println("A + B =");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) System.out.print(c[i][j] + "\t");
            System.out.print("\n");
        }
        sc.close();
    }
}

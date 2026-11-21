package Lab01;

import java.util.Scanner;

public class Exercise6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        double sum = 0;
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        double avg = sum / n;
        for (int i = 1; i < n; i++){
            double k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;

        }
        System.out.print("The sorted array: ");
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.print("\n");
        System.out.print("Sum = " + sum + "\n");
        System.out.print("Avg = " + avg + "\n");
        sc.close();
    }
}

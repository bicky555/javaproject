package Loops;

import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
// Display AP series

        Scanner sc = new Scanner(System.in);
//        System.out.println("Program to print AP series");
//        System.out.println("Enter a , r and n");
//        int a=sc.nextInt();
//        int r=sc.nextInt();
//        int n=sc.nextInt();
//
//        int term = a;
//        for(int i=0; i<n; i++){
//            System.out.print(term+",");
////            term=term+d;
//
//            //Display GP series
//
//            term=term*r;

        //Display Fibonacci series

        System.out.println("program to Fibonacci Series");
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.print(a+","+b+",");
        for(int i=0; i<n-2; i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}

package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double r;
        Scanner sc=new Scanner(System.in);
        int y;
        do {
            System.out.print("Enter the first number:");
            double a=sc.nextDouble();

            System.out.print("Enter the second number:");
            double b=sc.nextDouble();


            System.out.println("Press 1 for Addition.");
            System.out.println("Press 2 for Subtraction.");
            System.out.println("Press 3 for Multiplication.");
            System.out.println("Press 4 for Division.");
            System.out.println();
            System.out.print("Choose your option:");
            int x=sc.nextInt();
            switch (x){
                case 1:
                    r=a+b;
                    System.out.println(r);
                    break;
                case 2:
                    r=a-b;
                    System.out.println(r);
                    break;
                case 3:
                    r=a*b;
                    System.out.println(r);
                    break;
                case 4:
                    r=a/b;
                    System.out.println(r);
                    break;
                default:
                    System.out.println("Pleas enter a valid option.");
                    break;
            }
            System.out.println("To calculate more press 1 else 0.");
            y=sc.nextInt();
        }while (y==1);

    }
}



import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();


   int c = a/500;
   int b = a%500;
   int remainder = b%5;


       System.out.println(1000*c+(b-remainder));

    }



}
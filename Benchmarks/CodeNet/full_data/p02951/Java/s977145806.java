import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Main{


    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int  str_A = scan_A.nextInt();

        Scanner scan_B = new Scanner(System.in);
        int str_B = scan_B.nextInt();

        Scanner scan_C = new Scanner(System.in);
        int str_C = scan_C.nextInt();

        int D;
        int E = str_A - str_B;
        D= str_C - E;

        System.out.print(str_A+ "");
        System.out.print(str_B+"");
        System.out.println(str_C);
        System.out.println(D);
    }

}
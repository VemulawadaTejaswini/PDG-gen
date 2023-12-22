import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        double a = 1;
        double b = 0;
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
           b += 1.0 / k;
        }
        

        System.out.println(a / b);


    } 
}
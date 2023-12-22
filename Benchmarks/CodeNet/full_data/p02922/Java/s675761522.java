import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 1;
        int ans = 0;
        while(num < b) {
            num--;
            num += a;
            ans++;
        }
        System.out.println(ans);


    } 
}
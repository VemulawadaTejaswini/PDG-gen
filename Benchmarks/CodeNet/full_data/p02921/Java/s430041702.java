import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)) num++;
        }
        System.out.println(num);


    } 
}
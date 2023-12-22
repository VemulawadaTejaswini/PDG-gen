import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        String s = sc.next();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                boolean ok = true;
                for(int k = 0; k < sub.length(); k++) {
                    if(sub.charAt(k) != 'A' && sub.charAt(k) != 'C' && sub.charAt(k) != 'G' && sub.charAt(k) != 'T') ok = false;
                }
                if(ok) max = Math.max(max, sub.length());
            }
        }
        System.out.println(max);
    }
}
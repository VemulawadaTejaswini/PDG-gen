import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int now = 0;
        int ans = 1;
        for(int i = 0; i < n; i++) {
            now += l[i];
            if(now <= x) ans++; 
        }
        System.out.println(ans);
    } 
}
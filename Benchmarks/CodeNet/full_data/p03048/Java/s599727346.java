import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i <= n; i++) {
            if(r * i > n) break;
            for(int j = 0; j <= n; j++) {
                if(r * i + g * j > n) break;
                if((n - r * i - g * j ) % b == 0) ans++;
            }
        }
        System.out.println(ans);
    }
}
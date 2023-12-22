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
        for(int i = 0; i <= r; i++) {
            for(int j = 0; j <= g; j++) {
                int tmp = n - i - j;
                if(tmp <= b && tmp >= 0) ans++;
                if(tmp < 0) break;
            }
        }
        System.out.println(ans);
    }
}
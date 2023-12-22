/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int variety = sc.nextInt();
        int[] k = new int[n];
        int[] preference = new int[variety];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                int tmp = sc.nextInt();
                preference[tmp-1]++;
            }
        }
        for (int i = 0; i < variety; i++) {
            if (preference[i] == n) {
                ans++;
            } 
        }
        System.out.println(ans);
        sc.close();
    }
    private static int gcd(int m, int n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }
}
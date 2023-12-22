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
        double[] kingaku = new double[n];
        String[] JpyOrBtc = new String[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            kingaku[i]  = sc.nextDouble();
            JpyOrBtc[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (JpyOrBtc[i].equals("JPY")) {
                sum += kingaku[i];
            }else{
                sum += (kingaku[i]*380000);
            }
        }

        System.out.println(sum);

        sc.close();
    }
    
    private static long gcd(Long m, long n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }

    private static long[][] Combination_nCk(long n, long k) {
        n++; k++;
        long[][] ans = new long[(int)n][(int)k];
        for (int i = 0; i < n; i++) {
            ans[i][0] = 1;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                if (i < j) {
                    ans[i][j] = 0;
                }else{
                    ans[i+1][j+1] = ans[i][j] + ans[i][j+1];
                }
            }
        }
        return ans;
    }
}
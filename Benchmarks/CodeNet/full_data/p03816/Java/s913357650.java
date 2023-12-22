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
        int firstvariety = 0;
        int oddsandends = 0;
        int[] numofnums = new int[100001];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            numofnums[tmp]++;
        }
        for (int i = 1; i < numofnums.length; i++) {
            if (numofnums[i] == 0) {
                continue;
            }else{
                firstvariety++;
                numofnums[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            oddsandends += numofnums[i];
        }

        // if oe is even, all disappear
        if (oddsandends % 2 == 0) {
            System.out.println(firstvariety);
        } else {
            System.out.println(firstvariety-1);
        }


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
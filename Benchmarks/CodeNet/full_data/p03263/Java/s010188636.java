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

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = 0;
        boolean[][] ifEven = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int tmp = sc.nextInt();
                if (tmp % 2 == 0) {
                    ifEven[i][j] = true;
                } else {
                    ifEven[i][j] = false;
                }
            }
        }
        List<String> answer = new ArrayList<String>();


        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if (j != w - 1) {
                        if (ifEven[i][j]) {
                            continue;
                        } else {
                            if (ifEven[i][j+1]) {
                                // false-true => true - false
                                boolswap(ifEven[i][j], ifEven[i][j+1]);
                            }else{
                                // false-false => true-true
                                ifEven[i][j] = true;
                                ifEven[i][j + 1] = true;
                            }
                            answer.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
                            n++;
                        }
                    } else {
                        //j = w-1 j is even
                        if (ifEven[i][j]) {
                            continue;
                        }else{
                            if (ifEven[i+1][j]) {
                                boolswap(ifEven[i][j], ifEven[i][j+1]);
                            }else{
                                ifEven[i][j] = true;
                                ifEven[i + 1][j] = true;
                            }
                            answer.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
                            n++;
                        }
                    }
                }
            } else {
                // i is odd => right to left
                for (int j = w-1; j >= 0; j--) {
                    if (j != 0) {
                        if (ifEven[i][j]) {
                            continue;
                        } else {
                            if (ifEven[i][j-1]) {
                                // false-true => true - false
                                boolswap(ifEven[i][j], ifEven[i][j-1]);
                            }else{
                                // false-false => true-true
                                ifEven[i][j] = true;
                                ifEven[i][j-1] = true;
                            }
                            answer.add((i+1) + " " + (j+1) + " " + (i+1) + " " + j);
                            n++;
                        }
                    } else {
                        // j = 0 i is even
                        if (ifEven[i][j]) {
                            continue;
                        }else{
                            if (ifEven[i+1][j]) {
                                boolswap(ifEven[i][j], ifEven[i][j+1]);
                                System.out.println((i+1) + " " + (j+1) + " " + i + " " + (j+1));
                            }else{
                                ifEven[i][j] = true;
                                ifEven[i + 1][j] = true;
                            }
                            answer.add((i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1));
                            n++;
                        }
                    } 
                }  
            }
        }
        
        System.out.println(n);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }

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

    public static void boolswap(boolean a, boolean b) {
        boolean boolswap;
        boolswap = a;
        a = b;
        b = boolswap;
    }
}
/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] hoge = new int[m];
        String[] fuga = new String[m];
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                hoge[i] += (int)Math.pow(2, sc.nextInt()-1);
            }
            fuga[i] = Integer.toBinaryString(hoge[i]);
            while (fuga[i].length() < n) {
                fuga[i] = "0" + fuga[i];   
            }
        }
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < Math.pow(2,n); i++) {
            String test = make_bi_nari(n, i);
            int check = 0;
            for (int j = 0; j < m; j++) {
                int count = 0;
                for (int l = 0; l < n;) {
                    if (test.charAt(l) == '1' && fuga[j].charAt(l) == '1'){
                        count++;
                    }
                    l++;
                }
                if (count % 2 == p[j]) {
                    check++;
                }
            }
            if (check == m) {
                ans++;
            }
        }

        System.out.println(ans);
        sc.close();
    }

    public static String make_bi_nari(int nbit, int num_to_binary) {
        String res = Integer.toBinaryString(num_to_binary);
        while(res.length() != nbit){
            res = "0" + res;
        }
        return res;
    }

}




/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        abc122cGeTACsolve();
    }

    public static void abc122cGeTACsolve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        int[] ruiseki = new int[n];
        int ans = 0;
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            l[i]--;
            r[i]--;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i-1) == 'A' && s.charAt(i) == 'C'){
                if(i == 0){
                    ruiseki[i] = 1;
                }else{
                    ruiseki[i] = ruiseki[i-1] + 1;
                }
            }else{
                ruiseki[i] = ruiseki[i-1];
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(ruiseki[r[i]] - ruiseki[l[i]]);  
        }
    }
}




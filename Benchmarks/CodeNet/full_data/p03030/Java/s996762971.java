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
        int[] itr = new int[n];
        String[] s = new String[n];
        int[] p = new int[n];
        Pair[] pa = new Pair[n];
        Pair[] pa2 = new Pair[n];
        for (int i = 0; i < n; i++) {
            itr[i] = i+1;
            s[i] = sc.next();
            p[i] = sc.nextInt();
            pa[i] = new Pair(s[i],p[i]);
            pa2[i] = pa[i];
        }
        Comparator<Pair> cmp = Comparator.comparing(v -> v.x);
        Arrays.sort(pa,cmp.thenComparing(v -> -v.y));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pa[i].x.equals(pa2[j].x) && pa[i].y == pa2[j].y) {
                    System.out.println(j+1);
                }
            }
        }

        sc.close();
    }

    public static String make_bi_nari(int nbit, int num_to_binary) {
        String res = Integer.toBinaryString(num_to_binary);
        while(res.length() != nbit){
            res = "0" + res;
        }
        return res;
    }
    /**
     * Pair_int
     */
    public static class Pair {
        public String x;
        public int y;

        /**
         * Constructor 
         * Sample Code
         * 
         *      Pair[] pair = new Pair[5];
                for (int i = 0; i < 5; i++) {
                    pair[i] = new Pair(sc.nextInt(), sc.nextInt());
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(pair[i].x + " " + pair[i].y);
                }
         *
         */
        public Pair(String x, int y){
            this.x = x;
            this.y = y;
        }
        
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

}




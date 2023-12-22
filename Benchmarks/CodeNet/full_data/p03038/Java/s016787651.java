/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.awt.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int itr = 0;
        int cnt = 0;
        long ans = 0;
        PriorityQueue<Integer> card = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            card.add(sc.nextInt());
        }
        Pair[] pair = new Pair[m];
        for (int i = 0; i < m; i++) {
            pair[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(pair,Comparator.comparing(v -> -v.y)); // good

        while (cnt < n) {
            if (itr == m || (!card.isEmpty() && card.peek() >= pair[itr].y)) {
                /**
                 * not to change
                 */
                cnt++;
                long tmp = card.poll();
                /*
                System.out.println("tmp:" + tmp);
                */
                ans += tmp;
            }else{
                /**
                 * use Math.min(n-cnt, pair[itr].x) - cards
                 * if n-cnt > pair[itr].x, use all x - cards.
                 */
                int used = Math.min(n-cnt, pair[itr].x);
                cnt += used;
                ans += (long)pair[itr].y*(long)used;
                itr++;
            }
            /*
            System.out.println("Nowans:" + ans);
            */
        }
        System.out.println(ans);

        sc.close();
    }

    /**
     * Pair_int
     */
    public static class Pair {
        public int x;
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
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public String toString() {
            return "(" + x + ", " + y + ")";
        }


    }
}



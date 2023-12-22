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
        PriorityQueue<Long> pribig = new PriorityQueue<>(Comparator.naturalOrder());
        PriorityQueue<Long> prismall = new PriorityQueue<>(Comparator.reverseOrder());
        long big = 0;
        long small = 0;
        long b = 0;
        long ans;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                // koushin
                long a = sc.nextLong();
                long bb = sc.nextLong();
                b += bb;
                if (prismall.isEmpty() || prismall.peek() >= a) {
                    // prismall.peek -> pribig, a -> prismall
                    prismall.add(a);
                    small+=a;
                    if (!prismall.isEmpty() && prismall.size() > pribig.size() + 1 ) {
                        long change = prismall.poll();
                        pribig.add(change);
                        small -= change;
                        big += change;
                    }
                }else{
                    pribig.add(a);
                    big += a;
                    if (pribig.size() > prismall.size()) {
                        long odsends = pribig.poll();
                        prismall.add(odsends);
                        big -= odsends;
                        small += odsends;
                    }
                }
            }else if(tmp == 2){
                // hanbetsu
                // small = big or small = big + 1
                ans = prismall.peek();
                System.out.println(ans + " " + (-small+big +prismall.size() * ans - pribig.size()* ans + b));
            }
            
        }

        sc.close();
    }

}



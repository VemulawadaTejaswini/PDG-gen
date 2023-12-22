import java.util.*;
import java.lang.*;

/*
 * https://atcoder.jp/contests/dp/
 */
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        List asiba = new ArrayList();
        for (int i=0; i<n; i++) {
        	asiba.add(sc.nextInt());
        }
        
        int cost = 0;
        for (int i=n-1; i>0; i--) {
        	if (i == 1) {
        		cost += Math.abs((Integer) asiba.get(i) - (Integer) asiba.get(i-1));
        		continue;
        	} else {
	        	int cost1 = Math.abs((Integer) asiba.get(i) - (Integer) asiba.get(i-2));
	        	int cost2 = Math.abs((Integer) asiba.get(i) - (Integer) asiba.get(i-1));
	        	cost += Math.min(cost1, cost2);
	        	if (cost1 <= cost2) i--;
        	}
        }
        System.out.println(cost);
        sc.close();
	}
}

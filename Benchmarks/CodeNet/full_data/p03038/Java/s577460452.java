import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] cards = new long[n];
        for(int i = 0; i < n; i++) {
        	cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        
        HashMap<Integer, Long> a = new HashMap<>();
        int l = 0;
        for(int i = 0; i < m; i++) {
        	int b = sc.nextInt();
        	long c = sc.nextLong();
        	a.put(b, c);
        	l += b;
        }
        
        //System.out.println(l);
        
        long[] d = new long[l];
        int ind = 0;
        for(int key: a.keySet()) {
        	for(int i = ind; i < ind + key; i++) {
        		d[i] = a.get(key);
          	}
        	ind += key;
        }
        Arrays.sort(d);
        
        int cc = 0;
        int dd = l-1;
        while(cards[cc] < d[dd] && cc < n && dd >= 0) {
        	cards[cc] = d[dd];
        	cc++;
        	dd--;
        }
        
        //System.out.println(cc + " " + dd);
        
        long sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += cards[i];
        }
        System.out.println(sum);
    }
}

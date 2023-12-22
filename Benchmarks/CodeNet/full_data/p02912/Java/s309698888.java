import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	 public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   long m = sc.nextLong();
	   PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
	   for(int i = 0; i < n; i++) {
		   long a = sc.nextLong();
		   pq.add(a);
	   }
	   for(int i=0; i<m; i++){
			Long a = pq.poll();
			a = a/2;
			pq.add(a);
		}
	   long ans = 0;
		while(pq.size() > 0){
			ans += pq.poll();
		}
		System.out.println(ans);
	  }
	}
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   PriorityQueue <Integer>pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		   
		   int n = sc.nextInt();
		   int m = sc.nextInt();
		   
		   for(int i = 0; i < n ;i++) {
			   int a = sc.nextInt();
			   pq.offer(a);
		   }
		  
		   for(int i = 0 ; i < m; i++) {
				  int b = (int)Math.floor(pq.peek()/2);
				  pq.offer(b);
				  pq.poll();
			   }
		   long sum = 0;
		   for(int i = 0; i < n ;i++) {
			   sum += pq.poll();
		   }
		   System.out.println(sum);
		
			   
		   }

	}


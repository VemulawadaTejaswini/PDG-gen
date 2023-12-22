
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		int red[] = new int [a];
		int green[] = new int [b];
		int non[] = new int [c];
		
		for(int i = 0 ; i < a ;i++) {
			red[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0 ; i < b ; i++) {
			green[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0 ; i < c ; i++) {
			non[i] = Integer.parseInt(sc.next());
		}
 		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
		Arrays.sort(red);
		Arrays.sort(green);
		
		for(int i = a-1 ; i >= Math.max(0, a-x) ; i--) {
			pq.add(red[i]);
		}

		for(int i = b-1 ; i >= Math.max(0, b-y) ; i--) {
			pq.add(green[i]);
		}
		
		for(int i = 0 ; i < c ;i++) {
			pq.add(non[i]);
		}
		
		while(pq.size() > x + y) {
			pq.poll();
		}
		
		long sum = 0;
		
		for(int i = 0 ; i < x+ y ; i++) {
			sum += (long)pq.poll();
		}
		
		System.out.println(sum);
		
	
	}
	

}


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int p[] = new int[a];
		int q[] = new int[b];
		int r[] = new int[c];
		
		for(int i = 0; i < a; i++) {
			p[i] = sc.nextInt();
		}

		for(int i = 0; i < b; i++) {
			q[i] = sc.nextInt();
		}
		
		for(int i = 0; i < c; i++) {
			r[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		
		long total = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i = 0; i < x; i++) {
			total += p[a - i - 1];
			pq.add(p[a - i - 1]);
		}

		for(int i = 0; i < y; i++) {
			total += q[b - i - 1];
			pq.add(q[b - i - 1]);
		}

		for(int i = c - 1; i >= 0; i--) {
			int tmp = pq.remove();
			
			if(r[i] > tmp) {
				total += r[i] - tmp;
			}
		}
		System.out.println(total);
	}

}

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int[] aArray = new int[n];
			int[] bArray = new int[n];
			
			PriorityQueue<Integer> qa = new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Integer> qb = new PriorityQueue<>(Collections.reverseOrder());
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				qa.add(aArray[i]);
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				bArray[i] = sc.nextInt();
				qb.add(bArray[i]);
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				int bMax = qb.remove();
				int aMax = qa.remove();
				
				if ( aMax <= bMax ) {
					//ok
				}
				else {
					System.out.println("No");
					return;
				}
			}
			
			System.out.println("Yes");
			
		}
	}
	
	private static class Pair {
		public static long a;
		public static long b;
	}
}

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int[] aArray = new int[n];
			int[] bArray = new int[n];
			
			PriorityQueue<Integer> qa = new PriorityQueue<>();
			PriorityQueue<Integer> qb = new PriorityQueue<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				qa.add(aArray[i]);
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				bArray[i] = sc.nextInt();
				qb.add(bArray[i]);
			}
			
			PriorityQueue<Pair> qa1 = new PriorityQueue<>(
					new Comparator<Pair>() {

						@Override
						public int compare(Pair o1, Pair o2) {
							return Long.compare(o1.a, o2.a);
						}
						
					}
					);
			
			PriorityQueue<Pair> qb1 = new PriorityQueue<>(
					new Comparator<Pair>() {

						@Override
						public int compare(Pair o1, Pair o2) {
							return Long.compare(o1.b, o2.b);
						}
						
					}
					);
			
			for(int i = 0 ; i < n ; i++ ) {
				Pair p = new Pair();
				p.index = i;
				p.a = aArray[i];
				p.b = bArray[i];

				qa1.add(p);
				qb1.add(p);
			}
			
			int swapCount = 0;
			for(int i = 0 ; i < n ; i++ ) {
				
				Pair p = qb1.remove();
				
				//System.out.println("b = " + p.b + ", a = "  + p.a);
				if ( p.a <= p.b ) {
					qa1.remove(p);
				}
				else {
					swapCount++;
					Pair pOther = qa1.remove();
					
					//System.out.println("a = " + pOther.a);
					
					if ( pOther.a <= p.b ) {
						//ok
					}
					else {
						System.out.println("No");
						return;
					}
					long temp = p.a;
					p.a = pOther.a;
					pOther.a = temp;
				}
			}
			
			if ( swapCount < n-1) {			
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}
	
	private static class Pair {
		public int index;
		public long a;
		public long b;
		
		public String toString() {
			return "a=" + a + ", b=" + b; 
		}
	}
}

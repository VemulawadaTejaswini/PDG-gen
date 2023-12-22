import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		PriorityQueue<Integer> pqueue 
			= new PriorityQueue<Integer> (Collections.reverseOrder ());
		int N, M;
		long sum = 0;
		N = sc.nextInt ();
		M = sc.nextInt ();
		for (int i=0; i<N; i++) {
			int tmp = sc.nextInt ();
			pqueue.add ((Integer)tmp);
		}
		for (int i=0; i<M; i++) {
			int a = pqueue.poll ();
			pqueue.add ((Integer)(a/2));
		}
		for (Integer i: pqueue)
			sum += (int)i;
		System.out.println (sum);
	}
}
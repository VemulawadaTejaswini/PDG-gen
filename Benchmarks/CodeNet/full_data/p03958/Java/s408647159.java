

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K, T;
		String[] KT = br.readLine().split(" ");
		K = Integer.parseInt(KT[0]);
		T = Integer.parseInt(KT[1]);

		int[] a = new int[T];
		String[] A = br.readLine().split(" ");
		for(int i=0; i<T; i++) {
			a[i] = Integer.parseInt(A[i]);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<T; i++) {
			pq.add(-a[i]);
		}
		
		int prev = 0, pprev = 0;
		while(pq.size() != 0) {
			int now = pq.peek();
			pq.poll();
			pprev = prev;
			prev = now + 1;
			if (pprev != 0) pq.add(pprev);
		}
		
		System.out.println(-prev);
	}
}

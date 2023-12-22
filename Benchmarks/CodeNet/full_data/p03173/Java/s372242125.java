import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		PriorityQueue<Long> b = new PriorityQueue<Long>();
		for(int x: a) b.add((long)x);
		
		long ans = 0;
		while(b.size()>1) {
			long f = b.poll(); long s = b.poll();
			long sum = f+s; ans += sum;
			b.add(sum);
		}
		System.out.println(ans);
	}
}
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scan.nextLine());
		long startTime = System.currentTimeMillis();
		scan.close();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		if(K==0) {
			System.out.println(N*N);
			System.exit(0);
		}
		long count = 0;
		for(int b=K+1; b<N+1; b++) {
			long n = (N+1)/b;
			long d = 0;	
			d+= (b-K) * n;
			long L = K + b * n;
			long R = N;
			if(L <= R) {
				d+= R - L + 1;
			}
			count+=d;
		}
		System.out.println(count);
		//System.out.println("Done in: " + (System.currentTimeMillis()-startTime) + " ms");
	}
}

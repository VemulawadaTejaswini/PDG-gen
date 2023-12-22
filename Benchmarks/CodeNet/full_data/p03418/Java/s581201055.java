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
		long count = 0;
		for(int i=1; i<=N; i++) {
			for(int j=K; j<i; j++) {
				if(j!=0 && i%j >= K) {
					count++;
				}
			}
			if(i>=K) {
				count+=N-i;
			}
		}
		System.out.println(count);
		//System.out.println("Done in: " + (System.currentTimeMillis()-startTime) + " ms");
	}
}

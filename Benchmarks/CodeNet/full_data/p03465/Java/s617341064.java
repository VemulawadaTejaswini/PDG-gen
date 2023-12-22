import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long a[] = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			a[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(a);
		if(N%2==0) {
			long total = 0;
			for(int i=N-1;i>=N/2;i--) {
				total += a[i];
			}
			System.out.println(total);
		}else {
			long total = 0;
			for(int i=0;i<=N/2;i++) {
				total += a[i];
			}
			System.out.println(total);
		}
	}
}

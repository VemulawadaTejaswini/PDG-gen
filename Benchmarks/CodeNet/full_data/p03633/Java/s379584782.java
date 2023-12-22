import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		long[] t = new long[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(t);
		int j = 1;
		while(true) {
			int count = 1;
			for(int i = 0; i < n-1; i++) {
				if((t[t.length - 1] * j)%t[i] == 0) count ++;
			}
			if(count == n) break;
			j++;
		}
		System.out.println(t[t.length - 1] * j);
	}
}
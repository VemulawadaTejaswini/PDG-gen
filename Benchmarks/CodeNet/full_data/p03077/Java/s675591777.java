import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long[] T1 = new long[5];
		long[] T2 = new long[5];
		
		for(int i = 0; i < 5; i++) {
			T1[i] = sc.nextLong();
			T2[i] = T1[1];
		}
		
		Arrays.sort(T1);
		long min = T1[0];
		int x = 0;
		
		for(int i = 0; i < 5; i++) {
			if(T2[i] == min) {
				x = i;
			}
		}
		
		long t = 4;
		
		if(N <= min) {
			t += 1;
		} else {
			if(N % 2 != 0) {
				t += N / min + 1;
			} else {
				t += N / min;
			}
		}
		
		System.out.println(t);
		
	}
}

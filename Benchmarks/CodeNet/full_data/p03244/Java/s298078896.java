import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] odd = new long[N/2];
		long[] even = new long[N/2];
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				odd[i/2] = sc.nextLong();
			} else {
				even[i/2] = sc.nextLong();
			}
		}
		
		Arrays.sort(odd);
		Arrays.sort(even);
		
		long baseEven = maxCount(even);
		long baseOdd = maxCount(odd);
		if (baseEven == baseOdd) {
			baseEven--;
		}
		
		long ans = 0;
		for (long i : odd) {
			ans += Math.abs(baseOdd - i);
		}
		for (long i : even) {
			ans += Math.abs(baseEven - i);
		}
		
		System.out.println(ans);
	}
	
	static long maxCount(long[] array) {
		long sum = 0;
		for (long num : array) {
			sum += num;
		}
		
		return sum / array.length;
	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long x = Integer.parseInt(sc.next());
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		long result = 0;
		int kaisuu = 0;
		for (int i = 0; i < N; i++) {
			if(a[i] <= x) result += a[i];
			else {
				int index = 0;
				long time = a[i];
				long rest = a[i];
				for(int j = i-1; rest >= x; j--) {
					if(j < 0) j = N-1;

					rest -= x;
					long temp = a[j];
					int k = 0;
					if(j < i) k += x * (i-j);
					else k += x * (N-j+i);
					temp += k;

					if(temp < time) {
						time = temp;
						index = j;
						if(k > kaisuu) {
							kaisuu = k;
						}
					}
				}
				result += a[index];
			}
			result += x * kaisuu;
		}

		System.out.println(result);
	}

}

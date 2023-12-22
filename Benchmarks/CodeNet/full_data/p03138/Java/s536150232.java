import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long nisin = 1;
		long max = 0;
		for(int i = 0; i < n; i ++) {
			max += 0 ^ a[i];
		}
		while(nisin < k){
			long sum = 0;
			for(int i = 0; i < n; i ++) {
				sum += nisin ^ a[i];
			}
			if(sum > max) {
				max = sum;
			}
			nisin *= 2;
		}
		System.out.println(max);

	}
}
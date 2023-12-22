import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] hp = new long[n];
		for(int i = 0; i < n; i++) {
			hp[i] = sc.nextLong();
		}
		long Tmax = 1000000000;
		long Tmin = 0;
		long T = 0;
		int k = 0;
		while(Tmax - Tmin > 1) {
			T = Tmin + (Tmax-Tmin)/2;
			k = 0;
			for(int i = 0; i < n; i++) {
				if(hp[i] > b*T) {
					k += Math.ceil((double)(hp[i]-b*T) / (double)(a-b));
				}
			}
			if(k > T) {
				Tmin = T;
			} else {
				Tmax = T;
			}
		}
		System.out.println(Tmax);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextLong();
		
		long ans = 0;
		if (k == 0) {
			for (int i = 0; i < n; i++)
				ans += a[i];
		}
		else {
			int[] binary = new int[(int) (Math.log(k) / Math.log(2) + 1)];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < binary.length; j++) {
					if (a[i] >= Math.pow(2, binary.length - j - 1)){
						binary[binary.length - j - 1]++;
						a[i] -= Math.pow(2, binary.length - j - 1);
					}
				}
			}
		
			for (int i = 0; i < n; i++)
				ans += a[i];
		
			for (int i = 0; i < n; i++) {
				if (binary[n - i - 1] <= n / 2)
					ans += (n - binary[n - i - 1]) * Math.pow(2, n - i - 1);
				else
					ans += binary[n - i - 1] * Math.pow(2, n - i - 1);
			}
		}
		
		System.out.println(ans);

	}

}

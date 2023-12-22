import java.util.Scanner;

public class Main {
	final static int mod = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		if(d[0] != 0) {
			System.out.println(0);
		}else {
			long[] num = new long[n];
			num[0] = 0;
			int max = 1;
			long count = 1;
			for (int i = 1; i < n; i++) {
				num[d[i]]++;
				max = Math.max(max,d[i]);
			}
			//System.out.println(Arrays.toString(num));
			for (int i = 1; i < max; i++) {
				for(int j = 1; j <= num[i+1]; j++) {
					count = count * num[i];
					count %= mod;
				}
			}
			System.out.println(count);
		}

		sc.close();
	}
}
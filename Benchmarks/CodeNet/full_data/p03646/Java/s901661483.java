import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k, ans[];
		int n;
		k = sc.nextLong();
		sc.close();

		n = 50;
		if (k <= 50)
			n = (int) k;
		if(k == 0 || k == 1)n = 2;
		ans = new long[n];
		long count = k / (long) n;
		long r = k % (long) n;
		long tmp;

		for(int i = 0; i < n; ++i) ans[i] = i;
		
		for (int i = 0; i < n; ++i) {
			tmp = (long) (i + 1) * count;
			ans[i] += tmp;
		}

		tmp = 0;
		for (int i = 0; i < n; ++i) {
			tmp = -r;
			if (i < r)
				tmp += n + 1;
			ans[i] += tmp;
		}

		System.out.println(n);
		for (long i : ans)
			System.out.print(i + " ");
		System.out.println();
	}

}

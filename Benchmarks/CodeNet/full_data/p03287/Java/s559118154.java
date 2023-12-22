import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		long ans[] = new long[n];
		ans[0] = (long)a[0] % (long)m;
		for(int i = 1; i < n; ++i) {
			ans[i] = ans[i - 1];
			ans[i] += (long)a[i] % (long)m;
		}
		long cnt = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = i; j < n; ++j) {
				long tmp = ans[j];
				if(i != 0)tmp -= ans[i - 1];
				if(tmp % (long)m == 0)++cnt;
			}
		}
		System.out.println(cnt);
	}

}

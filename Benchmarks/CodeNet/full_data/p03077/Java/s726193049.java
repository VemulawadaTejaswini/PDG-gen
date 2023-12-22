import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a[] = new long[5];
		for (int i = 0; i < 5; ++i)
			a[i] = sc.nextLong();
		sc.close();
		long ans = 0;
		Arrays.sort(a);
		ans = 5 + ((n / a[0]) - 1);
		if(n % a[0] != 0)ans++;
		System.out.println(ans);
	}

}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		for(int i = 0; i < n; ++i)
			d[i] = sc.nextInt();
		sc.close();
		Arrays.sort(d);
		int mid = (n - 1) / 2;
		int ans = 0;
		if(d[mid] != d[mid + 1])
		ans = d[mid + 1] - d[mid];
		System.out.println(ans);
	}
}

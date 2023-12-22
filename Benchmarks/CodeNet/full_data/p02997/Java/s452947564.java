import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		int flag = -1;
		int t = ((n - 1) * (n - 2)) / 2;
		if (k > t)
			System.out.println(flag);
		else {
			int m = n - 1 + t - k;
			System.out.println(m);
			for(int i = 2; i <= n; ++i) {
				System.out.println(1 + " " + i);
			}
			int root = 2;
			int next = 3;
			for(int i = 0; i < t - k; ++i) {
				if(next > n) {
					root++;
					next = root + 1;
				}
				System.out.println(root + " " + next);
				next++;
			}
		}
	}
}

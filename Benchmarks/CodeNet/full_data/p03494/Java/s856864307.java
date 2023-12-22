import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());

		int ans = 0;
		boolean flag = true;
		
		while(flag) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					a[i] /= 2;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) ans++;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
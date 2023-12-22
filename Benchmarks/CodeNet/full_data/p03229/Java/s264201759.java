import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int mid = n / 2;
		if(n % 2 != 0) mid++;
		int[] b = Arrays.copyOfRange(a, 0, mid);
		int move = mid;
		for(int i = 0; i < n / 2; i++) a[i] = a[i + move];
		for(int i = 0; i < b.length; i++) a[i + n / 2] = b[i];
		int l = mid - 3, r = mid;
		while(l >= 0 && r < n) {
			int work = a[l];
			a[l] = a[r];
			a[r] = work;
			r += 2;
			l -= 2;
		}
		int ans = 0;
		for(int i = 1; i < n; i++) {
			ans += Math.abs(a[i] - a[i - 1]);
		}
		System.out.println(ans);
	}

	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}

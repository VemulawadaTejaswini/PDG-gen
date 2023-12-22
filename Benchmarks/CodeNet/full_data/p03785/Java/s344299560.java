import java.util.Arrays;
import java.util.Scanner;

class Main {
	int n,c,k;
	int[] t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();
		t = new int[n];
		for(int i=0;i<n;i++){
			t[i] = sc.nextInt();
		}
	}

	void solve() {
		int bus = 1;
		int cnt = 0;
		Arrays.sort(t);
		for(int i=0;i<n;i++){
			if ((cnt==c) || (t[i]-t[i-cnt])>k) {
				bus++;
				cnt=0;
			}
			cnt++;
		}
		System.out.println(bus);
	}
}
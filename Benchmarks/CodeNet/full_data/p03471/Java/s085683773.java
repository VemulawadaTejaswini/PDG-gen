import java.util.*;
// warm-up
// Maybe you can fix one of the currencies and brute force the other two for O(n^2)
// Not sure
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Y = sc.nextInt(), i = 0, j = 0, k = 0;
		for (i=1; i<=Y/10000; i++) {
			for (j=1; j<=Y/5000; j++) {
				for (k=1; k<=Y/1000; k++) {
					if (i+j+k!=N) continue;
					if (((10000*i)+(5000*j)+(1000*k))==Y) {
						System.out.println(i+" "+j+" "+k);
						System.exit(0);
					}
				}
			}
		}
		System.out.println("-1 -1 -1");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
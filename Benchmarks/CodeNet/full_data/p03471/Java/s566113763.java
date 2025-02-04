import java.util.*;
// warm-up
// Wonder what the O(n) and O(1) solutions are..
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Y = sc.nextInt(), i = 0, j = 0, k = 0;
		for (i=1; i<=Y/10000; i++) {
			for (j=1; j<=Y/5000; j++) {
				k = (Y-((10000*i)+(5000*j)))/1000;
				if (k>=0 && i+j+k==N) {
					System.out.println(i+" "+j+" "+k);
					System.exit(0);
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
import java.util.Scanner;

public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] n = new int[N];
		for (int i=0; i<N; i++) {
			n[i] = in.nextInt();
		}
		in.close();
		
		int tIndex = 0;
		int sIndex = 0;
		
		if (n[0] < n[1]) {
			tIndex = 1;
			sIndex = 0;
		}
		
		for (int i=2; i<N; i++) {
			if (n[tIndex] < n[i]) {
				sIndex = tIndex;
				tIndex = i;
			} else if (n[sIndex] < n[i]) {
				sIndex = i;
			}
		}
		
		for (int i=0; i<N; i++) {
			if (i==tIndex) {
				System.out.println(n[sIndex]);
			} else {
				System.out.println(n[tIndex]);
			}
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}

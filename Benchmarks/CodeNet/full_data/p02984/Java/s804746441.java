import java.util.Scanner;
 
public class Main {
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] ai = new long[N];
		long before = 0;
		for (int i=0; i<N; i++) {
			ai[i] = in.nextLong();
			if (i % 2 == 0) {
				before += ai[i];
			} else {
				before -= ai[i];
			}
		}
		in.close();
		
		System.out.print(before);
		for (int i=1; i<N; i++) {
			before = (ai[i-1] - before/2) * 2;
			System.out.print(" " + before);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}

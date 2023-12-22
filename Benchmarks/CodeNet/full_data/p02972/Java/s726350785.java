import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] n = new int[N+1];
		for (int i=1; i<=N; i++) {
			n[i] = in.nextInt();
		}
		in.close();
		
		int[] b = new int[N+1];
		Arrays.fill(b, 0);
		int count = 0;
		for (int i=N; i>0; i--) {
			int total = 0;
			for (int j=i+i; j<=N; j+=i) {
				total += b[j];
			}
			total = total % 2;
			if (total != n[i]) {
				b[i] = 1;
				count++;
			}
		}
		
		System.out.println(count);
		for (int i=1; i<=N; i++) {
			if (b[i] != 0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}

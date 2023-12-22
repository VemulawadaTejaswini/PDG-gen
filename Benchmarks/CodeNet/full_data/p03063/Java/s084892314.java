import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String stones = in.next();
		in.close();
		
		// i = [i-1] is left, [i] is right
		int[] left = new int[N+1];	// left is white(.)
		
		// i = [i-1] is left, [i] is right
		int[] right = new int[N+1];	// right is black(#)
		
		left[0] = 0;
		for (int i=0; i<N; i++) {
			if (stones.charAt(i) == '.') {
				left[i+1] = left[i];
			} else {
				left[i+1] = left[i] + 1;
			}
		}
		right[N] = 0;
		for (int i=N-1; i>=0; i--) {
			if (stones.charAt(i) == '#') {
				right[i] = right[i+1];
			} else {
				right[i] = right[i+1] + 1;
			}
		}
		
		int min = Integer.MAX_VALUE;
		for (int i=0; i<N+1; i++) {
			int val = left[i] + right[i];
			if (val < min) {
				min = val;
			}
		}
		
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}

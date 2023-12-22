import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;
	
	void doIt() {
		int[] A = new int[9];
		for(int i = 0; i < 9; i++) {
			A[i] = sc.nextInt();
		}
		int N = sc.nextInt();
		int b[] = new int[N];
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		boolean[] opened = new boolean[9];
		Arrays.fill(opened, false);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 9; j++) {
				if(b[i] == A[j]) opened[j] = true;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(opened[i] && opened[i + 3] && opened[i + 6]) {
				System.out.println("Yes");
				return;
			}
		}
		for(int i = 0; i < 9; i += 3) {
			if(opened[i] && opened[i + 1] && opened[i + 2]) {
				System.out.println("Yes");
				return;
			}
		}
		if(opened[0] && opened[4] && opened[8]) {
			System.out.println("Yes");
		}
		else if(opened[2] && opened[4] && opened[6]) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}

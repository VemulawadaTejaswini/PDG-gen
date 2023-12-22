import java.util.*;
import java.io.*;
public class Main {
	static int n;
	static int A, B, C;
	static int[] bamboos;
	
	public static int solve (int stuff, int a, int b, int c) {
		if (stuff == n) {
			if (Math.min(a, Math.min(b, c)) > 0) {
				return Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c) - 30;
			}
			return (1<<30);
		}
		int yes1 = solve (stuff + 1, a, b, c);
		int yes2 = solve (stuff + 1, a + bamboos[stuff], b, c) + 10;
		int yes3 = solve (stuff + 1, a, b + bamboos[stuff], c) + 10;
		int yes4 = solve (stuff + 1, a, b, c + bamboos[stuff]) + 10;
		return Math.min(yes1, Math.min(yes2, Math.min(yes3, yes4)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		bamboos = new int[n];
		for (int i = 0; i < n; i++) {
			bamboos[i] = sc.nextInt();
		}
		System.out.println(solve(0,0,0,0));

	}

}

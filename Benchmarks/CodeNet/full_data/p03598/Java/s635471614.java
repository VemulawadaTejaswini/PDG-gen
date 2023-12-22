import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int cout = 0;
		for(int i = 0; i < n; i++) {
			if(x[i] > k / 2) {
				cout += k - x[i];
			} else {
				cout += x[i];
			}
		}
		System.out.println(cout * 2);
	}
}
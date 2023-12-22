import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int[] b = Arrays.copyOf(a, n);
		while(true) {
			boolean change = false;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j) continue;
					int p = a[i] % b[j];
					if(b[i] > p && p != 0) {
						b[i] = p;
						change = true;
					}
				}
			}
			if(!change) break;
		}
		Arrays.sort(b);
		System.out.println(b[0]);
	}
}

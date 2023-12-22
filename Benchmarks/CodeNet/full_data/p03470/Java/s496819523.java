import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int count = 1;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < n-1; i++) {
			if(a[i] != a[i+1]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
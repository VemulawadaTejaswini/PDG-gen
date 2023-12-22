import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while(true) {
			for(int i = 0; i < n; i++) {
				if(a[i] % 2 == 0) {
					a[i] = a[i]/2;
				}else {
					System.out.println(count);
					sc.close();
					return;
				}
			}
			count++;
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
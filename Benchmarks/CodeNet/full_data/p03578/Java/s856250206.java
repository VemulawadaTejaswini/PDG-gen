import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] D = new int[n];
		for(int i = 0; i < n; i++) {
			D[i] = sc.nextInt();
		}
		int m = sc.nextInt();	
		int[] T = new int[m];
		for(int i = 0; i < m; i++) {
			T[i] = sc.nextInt();
		}
		Arrays.sort(D);
		Arrays.sort(T);
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(D[i] == T[count] ) count++;
			if(count == m) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

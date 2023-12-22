import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int N = scan.nextInt();
		int m = 0;
		int n = 0;
		Integer[] t = new Integer[N];
		for(int i=0; i<N; i++) {
			t[i] = scan.nextInt();
			if(m < t[i]) {
				m = t[i];
				n = i;
			}
		}
		Arrays.sort(t, Collections.reverseOrder());
		for(int i=0; i<N; i++) {
			if(n != i) {
				System.out.println(m);
			} else {
				System.out.println(t[1]);
			}
		}
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}

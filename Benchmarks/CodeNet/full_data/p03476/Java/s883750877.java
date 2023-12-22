import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int Q;
	int l;
	int r; 
	int[] c;
	boolean[] f;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		c = new int[100001];
		f = new boolean[100002];
		
		for(int i = 2; i <=100000; i++) {
			if((!f[i])) {
				for(int j = i + i; j <= 100000; j+=i) {
					f[j] = true;
				}
			}
		}
		for(int i = 3;i <=100000; i+=2) {
			if(!f[i] && !f[(i+1)/2]) c[i]++;
		}
		for(int i = 3; i <=100000; i++) {
			c[i] += c[i-1];
		}
		Q = sc.nextInt();
	
		for(int i = 0; i < Q; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			System.out.println(c[r] -c[l-1]);
		}
		
		Q = sc.nextInt();
		
		for(int i = 0; i < Q; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
		}
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
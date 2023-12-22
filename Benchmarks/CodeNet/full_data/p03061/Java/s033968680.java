import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if(n < 3) {
			System.out.println(a[0] < a[1] ? a[1] : a[0]);
			return;
		}
		int gcd, idx, min;
		int gcd1 = gcd(a[0], a[1]);
		int gcd2 = gcd(a[1], a[2]);
		int gcd3 = gcd(a[2], a[0]);
		if(gcd1 >= gcd2 && gcd1 >= gcd3) {
			gcd = gcd1;
			idx = 2;
		}
		else if(gcd2 >= gcd3) {
			gcd = gcd2;
			idx = 0;
		}
		else {
			gcd = gcd3;
			idx = 1;
		}
		min = gcd(gcd1, a[2]);
		for(int i = 3; i < n; i++) {
			int next = gcd(gcd, a[i]);
			if(next < min) {
				gcd = min;
				idx = i;
				min = gcd(gcd, a[i]);
			}
			else {
				gcd = next;
				min = gcd(min, a[i]);
			}
			
		}
		System.out.println(gcd);

		
		
	}
	
	
	
	int gcd(int a, int b) {
		int w;
		while(b != 0) {
			w = a % b;
			a = b;
			b = w;
		}
		return a;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

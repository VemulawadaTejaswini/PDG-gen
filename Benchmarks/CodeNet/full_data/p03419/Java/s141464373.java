import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a+b > n + 1){
			System.out.println(-1);
			return;
		}
		
		if(a*b < n){
			System.out.println(-1);
			return;
		}
		
		
		System.out.println(x(a,b,n));		
		
		
	}

	String x(int a, int b, int n) {

		int z = n;
		StringBuilder sb = new StringBuilder();
		out: for (;;) {
			int x = Math.min(a * (b-1) + 1, z);
			for (int y = x; y <= z; y++) {
				sb.append(y);
				if(x == 1 && y == z){
					break out;
				}
				sb.append(" ");
			}
			b--;
			z = x-1;
		}
		return sb.toString();
	}

}

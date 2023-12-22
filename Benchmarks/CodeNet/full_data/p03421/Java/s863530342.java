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
		
		if(a+b-1 >n){
			System.out.println(-1);
			return;
		}
		
		if(a*b < n){
			System.out.println(-1);
			return;
		}
		
		
		x(a,b,n);		
		
		
	}

	void x(int a, int b, int n) {

		int z = n;
		
		out: for (;;) {
			int x = Math.min(a * (b-1) + 1, z);
			for (int y = x; y <= z; y++) {
				System.out.print(y);
				if( (x == 1 && y == z)){
					break out;
				}
				System.out.print(" ");
			}
			b--;
			z = x-1;
		}
	}

}

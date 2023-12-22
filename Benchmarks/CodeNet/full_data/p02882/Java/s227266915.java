import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		if (a*a*b <= 2*x) {
			System.out.println(Math.atan(2.0*b/a-2.0*x/a/a/a)/Math.PI*180);
		} else {
			System.out.println(Math.atan(1.0*a*b*b/2/x)/Math.PI*180);
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
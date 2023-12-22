
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
		
		System.out.println( Math.min(a, b) +" "+ Math.max(0, n - (n - a) -  (n -b)));
		
	}
}

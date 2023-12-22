import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		sA();
	}

	void sA() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(b / a > c) {
			System.out.println(c);
		}
		else System.out.println(b / a);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println((n - h + 1) * (n - w + 1));
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}

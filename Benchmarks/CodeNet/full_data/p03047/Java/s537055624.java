import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(n - k + 1);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}

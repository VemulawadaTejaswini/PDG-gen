import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a + b;
		if(max < Math.max(a, b) * 2 - 1) {
			max = Math.max(a, b) * 2 - 1;
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

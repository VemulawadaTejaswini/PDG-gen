import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b && b == c)System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

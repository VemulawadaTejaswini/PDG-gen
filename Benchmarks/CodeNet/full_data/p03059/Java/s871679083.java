import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int next = 0, cnt = -b, i = 1;
		while(next <= t) {
			next += a * i;
			cnt+= b;
		}
		System.out.println(cnt);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}

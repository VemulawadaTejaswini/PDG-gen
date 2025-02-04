import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = a; ; i += a) {
			if (i % b == c) {
				System.out.println("YES");
				return;
			} else if (!set.contains(i % b)) {
				set.add(i % b);
			} else {
				break;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

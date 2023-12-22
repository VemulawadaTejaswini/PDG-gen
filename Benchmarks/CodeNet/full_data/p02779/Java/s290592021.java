import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		Set<Long> set = new HashSet<Long>();
		long n=sc.nextLong();
		for(int i=0; i<n; i++) {
			Long a = sc.nextLong();
			if(set.contains(a)) {
				System.out.println("NO");
				sc.close();
				return;
			}
			set.add(a);
		}
		System.out.println("YES");
		sc.close();
	}
}

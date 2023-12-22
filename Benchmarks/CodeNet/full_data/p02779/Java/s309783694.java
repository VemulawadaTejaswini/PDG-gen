import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			set.add(a);
		}

		if(n == set.size()) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

}

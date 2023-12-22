import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (list.contains(a)) {
					System.out.println("NO");
					return;
				}
				list.add(a);
			}
			System.out.println("YES");
		}
	}

}

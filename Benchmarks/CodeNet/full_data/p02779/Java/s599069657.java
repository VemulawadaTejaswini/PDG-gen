
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			list.add(a);
			set.add(a);
		}
		
		if (list.size() == set.size()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}




import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> ans = new HashSet<>();
		for(int i = 1; i < N + 1; i++) {
			ans.add(i);
		}
		for(int i = 0; i < M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans.removeIf(j -> j < l || r < j);
		}
		System.out.println(ans.size());
	}

}

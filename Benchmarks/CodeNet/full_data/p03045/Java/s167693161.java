
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if(set.contains(y) && !ans.contains(x)) {
				set.add(x);
			}
			set.add(y);
			if(!set.contains(x) && !ans.contains(x)) {
				ans.add(x);
			}
		}
		System.out.println(ans.size());
	}
}


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int overlap = 0;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if(set.contains(tmp)) {
				overlap++;
			}
		}
		int ans = 0;
		if(overlap % 2 == 0) {
			ans = n - overlap / 2;
		} else {
			ans = n - overlap / 2 - 1;
		}
		System.out.println(ans);
	}

}

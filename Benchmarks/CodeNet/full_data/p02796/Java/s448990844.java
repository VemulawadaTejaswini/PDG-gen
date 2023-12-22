import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Pair[] robots = new Pair[n];
		Arrays.setAll(robots, i -> new Pair(sc.nextInt(), sc.nextInt()));
		Arrays.sort(robots, (r1, r2) -> r1.right - r2.right);
		
		int cur = Integer.MIN_VALUE;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if (cur <= robots[i].left) {
				cnt++;
				cur = robots[i].right;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
	
}

class Pair {
	int left;
	int right;
	
	Pair(int left, int right) {
		this.left = left;
		this.right = right;
	}
}


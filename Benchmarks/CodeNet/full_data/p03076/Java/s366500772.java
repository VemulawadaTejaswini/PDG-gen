import java.util.*;
import java.lang.*;

public class Main {
	static int[] dish;
	static boolean[] used;
	static int min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dish = new int[5];
		for (int i = 0; i < 5; i++) {
			dish[i] = sc.nextInt();
		}
		used = new boolean[5];
		min = 100000000;
		dfs(0, 0);
		System.out.println(min);
	}
	static void dfs(int count, double time) {
		if (count == 5) {
			min = Math.min(min, (int) time);
			return;
		}
		for (int i = 0; i < 5; i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(count + 1, Math.ceil(time / 10) * 10 + dish[i]);
				used[i] = false;
			}
		}
	}
}
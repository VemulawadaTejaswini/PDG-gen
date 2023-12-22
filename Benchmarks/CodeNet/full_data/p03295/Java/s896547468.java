import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			arr[Math.max(a, b)] = arr[Math.min(a, b)] + 1;
		}
		Set<Integer> set = new HashSet<>();
		for(int a : arr) {
			set.add(a);
		}
		System.out.println(set.size() - 1);
	}
}
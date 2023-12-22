import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		List<Integer> xs = new ArrayList<>(x.length);
		long result = scan(x, a, xs, 0);
		
		System.out.println(result);
	}

	private static long scan(int[] x, int a, List<Integer> xs, int index) {
		if (index == x.length) {
			return isAvg(xs, a)? 1 : 0;
		}
		
		long count1 = scan(x, a, xs, index + 1);
		List<Integer> newList = new ArrayList<>(xs);
		newList.add(x[index]);
		long count2 = scan(x, a, newList, index + 1);
		
		return count1 + count2;
	}

	private static boolean isAvg(List<Integer> xs, int a) {
		if (xs.isEmpty()) {
			return false;
		}
		
		int sum = xs.stream().collect(Collectors.summingInt(i -> i));
		return sum == a * xs.size();
	}

}

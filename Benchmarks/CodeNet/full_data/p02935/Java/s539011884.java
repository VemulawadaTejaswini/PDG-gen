import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		
		List<Long> list = new ArrayList<>();


		for (int i = 0; i < n; i++) {
			long v = sc.nextLong();
			list.add(v);
		}
		Collections.sort(list);

		double result = 0;
		result += list.get(0) / Math.pow(2,n-1);
		result += list.get(1) / Math.pow(2,n-1);

		for (int i = 2; i < n; i++) {
			long v = list.get(i);
			result += v / Math.pow(2,n-i);
		}

		System.out.println(result);

	}
}

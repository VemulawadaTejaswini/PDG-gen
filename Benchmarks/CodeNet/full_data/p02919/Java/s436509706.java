import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			long p = sc.nextLong();
			list.add(p);
		}

		long result = 0;

		long currentMax = 0;
		long currentSecondMax = 0;

		for (int i = 0; i < n - 1 ; i++) {
			long one = list.get(i);
			long two = list.get(i+1);
			currentMax = Math.max(one,two);
			currentSecondMax = Math.min(one,two);

			result += currentSecondMax;
			for (int j = i + 2 ; j < n; j++) {
				long p = list.get(j);
				if(p <= currentSecondMax){
					result += currentSecondMax;
				} else if(p >= currentMax){
					currentSecondMax = currentMax;
					currentMax = p;
					result += currentSecondMax;
				} else {
					currentSecondMax = p;
					result += currentSecondMax;
				}
			}
		}
		System.out.println(result);


	}
}

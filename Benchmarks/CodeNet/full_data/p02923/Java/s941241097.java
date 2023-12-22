import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			long h = sc.nextLong();
			list.add(h);
		}

		int maxResult = 0;
		long prevH = list.get(0);
		int currentCount = 0;
		for (int i = 1; i < n; i++) {
			long h = list.get(i);
			
			if(h <= prevH){
				currentCount++;
			} else{
				maxResult = Math.max(currentCount, maxResult);
				currentCount = 0;
			}

			prevH = h;
		}
		maxResult = Math.max(currentCount, maxResult);


		System.out.println(maxResult);

	}
}

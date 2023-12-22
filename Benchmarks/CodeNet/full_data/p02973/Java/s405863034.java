import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>(n);
		List<Boolean> flagList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			list.add(a);
			flagList.add(true);
		}

		long max = 0;
		List<Long> maxList = new ArrayList<>(n);
		for (int i = n-1; i >=0; i--) {
			long a = list.get(i);
			max = Math.max(max, a);
			maxList.add(max);
		}
		Collections.reverse(maxList);

		int result = 0;
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			if(total == n) break;
			if(!flagList.get(i)){
				continue;
			}
			long a = list.get(i);
			flagList.set(i ,false);
			total++;
			result++;

			long rightMax = maxList.get(i);
			if(a > rightMax){
				continue;
			}
			for (int j = i+1; j < n; j++) {
				if(!flagList.get(j)){
					continue;
				}
				long currentA = list.get(j);
				if(a >= currentA){
					continue;
				}
				a = currentA;
				flagList.set(j ,false);
				total++;
			}
		}
		

		System.out.println(result);
	}
}

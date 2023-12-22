import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		List<Long> list = new ArrayList<>();
		List<Boolean> flagList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			list.add(a);
			flagList.add(true);
		}

		int result = 0;
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			// System.out.println(flagList);
			if(total == n) break;
			if(!flagList.get(i)){
				continue;
			}
			long a = list.get(i);
			flagList.set(i ,false);
			total++;
			result++;
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

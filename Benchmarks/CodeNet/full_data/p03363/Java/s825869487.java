import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] aArray = new int[n];
		for (int i = 0; i < n; i++) {
			aArray[i] = scan.nextInt();
		}
		scan.close();

		int count = 0;
		int sum = 0;
		Map<Integer, Integer> sumMap = new HashMap<>();
		sumMap.put(0, 1);
		for (int i = 0; i < n; i++) {
			sum += aArray[i];
			if (sumMap.containsKey(sum)) {
				int sumCount = sumMap.get(sum);
				count += sumCount;
				sumMap.put(sum, sumCount + 1);
			} else {
				sumMap.put(sum, 1);
			}
		}
		System.out.println(count);
	}
}

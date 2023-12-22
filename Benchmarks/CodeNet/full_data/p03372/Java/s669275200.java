import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int lost = 0;
		int eat = 0;
		Map<Integer, SushiDto> sushiMap = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int work = sc.nextInt();
			int kcal = sc.nextInt();
			sushiMap.put(Integer.valueOf(i), new SushiDto(work, kcal));
		}
		//時計回りした時のresultを詰める
		int[] resultA = new int[n];
		for (int i = 0; i < n; i++) {
			SushiDto sushi = sushiMap.get(Integer.valueOf(i + 1));
			eat = eat + sushi.kcal;
			lost = lost + sushi.work;
			resultA[i] = eat - lost;
		}
		//反時計回りした時のresultを詰める
		int max = n;
		int[] resultB = new int[n];
		for (int i = 0; i < n; i++) {
			Integer key = Integer.valueOf(max);
			SushiDto sushi = sushiMap.get(key);
			eat = eat + sushi.kcal;
			lost = lost + sushi.work;
			resultB[i] = eat - lost;
			max--;
		}
		//どこかで一度反時計回りした時のresultを詰める
		Arrays.sort(resultA);
		Arrays.sort(resultB);
		int maxA = resultA[n-1];
		int maxB = resultB[n-1];
		if (maxA < maxB) System.out.println(maxB);
		if (maxA > maxB) System.out.println(maxA);
	}

}
class SushiDto {
	int work;
	int kcal;
	SushiDto(int work, int kcal) {
		this.work = work;
		this.kcal = kcal;
	}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 問題数
		int m = sc.nextInt(); // 提出回数
		Map<Integer, Integer> map = new HashMap<>(); // 問題番号, 正当回数
		
		int cntA = 0;
		int cntW = 0;
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			String v = sc.next();
			if (v.equals("AC") && map.get(k) == null) {
				map.put(k, 1);
				cntA++;
				continue;
			}
			
			if (v.equals("WA") && map.get(k) == null) {
				cntW++;
			}
		}
		System.out.println(cntA);
		System.out.println(cntW);
		
	}
}

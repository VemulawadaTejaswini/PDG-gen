
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 問題数
		int m = sc.nextInt(); // 提出回数
		Map<Integer, Integer> map = new HashMap<>(); // 問題番号, 誤答回数
		List<Integer> list = new ArrayList<>(); //　正当した問題番号
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			String s  = sc.next();
			if (s.equals("AC") && !list.contains(a)) {
				list.add(a);
			}
			
			if  (s.equals("WA") && !list.contains(a)) {
				if (map.get(a) == null) {
					map.put(a, 1);
				} else {
					map.put(a, map.get(a) + 1);
				}
			}
		}
		
		int sum = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (list.contains(e.getKey())) {
				sum += e.getValue();
			}
		}
		
		System.out.println(list.size());
		System.out.println(sum);
		
	}
}

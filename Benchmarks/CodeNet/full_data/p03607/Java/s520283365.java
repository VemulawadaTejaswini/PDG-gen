import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i < N; i++) {
			Integer a = sc.nextInt();
			add(map,a);
		}
		System.out.println(map.size());
	}
	static void add(Map<Integer,Integer> map, Integer want) {
		if(map.containsKey(want)) {
			map.remove(want);
		} else {
			map.put(want, 1);
		}
	}
}
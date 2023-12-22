import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = sc.nextInt();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				int num = map.get(s) +1;
				map.replace(s, num);
			}else {
				map.put(s, 1);
			}
		}

		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			String t = sc.next();
			if(map.containsKey(t)) {
				int num = map.get(t) -1;
				map.replace(t, num);
			}
		}

		for(int num : map.values()) {
			result = Math.max(result, num);
		}

		System.out.println(result);
	}
}

import java.util.HashMap;
import java.util.Scanner;

public class Main {


 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String cube[] = new String[S.length()];

		for (int i = 0; i < S.length(); i++) {
			cube[i] = S.substring(i, i+1);
		}

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			if (!map.containsKey(cube[i])) {
				map.put(cube[i], 1);
			} else {
				int cnt = map.get(cube[i]);
				map.put(cube[i], cnt+1);
			}
		}

		if (!map.containsKey("0") || !map.containsKey("1")) {
			System.out.println(0);
			return;
		}

		int cnt0 = map.get("0");
		int cnt1 = map.get("1");

		System.out.println(Math.min(cnt0, cnt1)*2);
 	}
}

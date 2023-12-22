import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		char[] ch = S.toCharArray();
		Map<Character, Integer> chMap = new TreeMap<>();
		for(int i = 0;i < ch.length;i++) {
			if(chMap.containsKey(ch[i])) {
				chMap.put(ch[i], chMap.get(ch[i])+1);
			}else {
				chMap.put(ch[i], 1);
			}
		}
		int ans = 1;
		for(Map.Entry<Character, Integer> entry : chMap.entrySet()) {
			ans = ans * (entry.getValue() + 1) % 1_000_000_007;
		}
		ans--;
		System.out.println(ans);
	}
}
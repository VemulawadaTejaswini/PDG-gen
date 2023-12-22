import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		HashMap<String, Integer> S = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			char[] ch = scn.nextLine().toCharArray();
			String s = makeString(ch);
			if(S.containsKey(s)) {
				S.put(s, S.get(s)+1);
			}else {
				S.put(s, 1);
			}
		}
		long ans = 0;
		for(long num:S.values()) {
			ans += (num-1) * num /2;
		}
		System.out.println(ans);
	}

	public static String makeString(char[] ch) {
		String s = "";
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			s += ch[i];
		}
		return s;
	}
}

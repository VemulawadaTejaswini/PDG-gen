import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> cnt = new HashMap<Character, Integer>();
		char[] march = {'M', 'A', 'R', 'C', 'H'};
		for(char c : march) cnt.put(c, 0);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			char st = S.charAt(0);
			boolean exist = false;
			for(char c : march) exist |= (st == c);
			if(exist) cnt.put(st, cnt.get(st) + 1);
		}
		long ans = 0;
		int comb = (1 << 3) - 1;
		while(comb < (1 << 5)){
			boolean make = true;
			for(int i = 0; i < 5; i++) {
				if(((comb >> i) & 1) == 1) make &= (cnt.get(march[i]) > 0);
			}
			if(!make) {
				int x = (comb & -comb), y = comb + x;
				comb = ((comb & ~y) / x >> 1) | y;
				continue;
			}

			long tmp = 1;
			for(int i = 0; i < 5; i++) {
				if(((comb >> i) & 1) == 1) {
					tmp *= (long)cnt.get(march[i]);
				}
			}
			ans += tmp;

			int x = (comb & -comb), y = comb + x;
			comb = ((comb & ~y) / x >> 1) | y;
		}
		System.out.println(ans);
	}
}
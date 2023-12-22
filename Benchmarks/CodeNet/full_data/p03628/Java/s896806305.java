import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S1 = sc.next();
		String S2 = sc.next();
		long mod = 1000000007;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		String pre = S1.substring(0, 1);
		for(int i = 1; i < S1.length(); i++) {
			if(S1.substring(i , i + 1).equals(pre)) {
				ary.add(2);
				if(i != N - 1) {
					pre = S1.substring(i + 1, i + 2);
				}
				i++;
				if(i == N - 1) {
					ary.add(1);
				}
			} else {
				ary.add(1);
				pre = S1.substring(i , i + 1);
			}
		}
		if(S1.length() == 1) {
			ary.add(1);
		}
		
		int pre_n = ary.get(0);
		long ans = 0;
		if(pre_n == 1) {
			ans = 3;
		} else {
			ans = 6;
		}
		for(int i = 1; i < ary.size(); i++) {
			if(pre_n == 1 && ary.get(i) == 2) {
				ans = (ans * 2) % mod;
			}else if (pre_n == 2 && ary.get(i) == 2){
				ans = (ans * 3) % mod;
			} else if (pre_n == 2 && ary.get(i) == 1){
			} else {
				ans = (ans * 2) % mod;
			}
			pre_n = ary.get(i);
		}
		System.out.println(ans);
	}
}

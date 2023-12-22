import java.util.*;
public class Main {
	static int modAns = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int multi = sc.nextInt();
		long ans = 1;
		ArrayList<Integer> counts = new ArrayList<Integer>();
		for(int i = 2; i <= multi; i ++) {
			if(multi % i == 0) {
				int count = 0;
				while(multi % i == 0) {
					multi /= i;
					count ++;
				}
				counts.add(count);
			}
			if(multi == 1) { break; }
		}
		for(int i = 0; i < counts.size(); i ++) {
			ans *= combi(counts.get(i) + length - 1, Math.min(counts.get(i), length - 1));
			ans %= modAns;
		}
		System.out.println(ans);
	}

	public static long combi(int n, int r) {
		if (n == r || r == 0) {
			combis[n][r] = 1;
			return 1;
		}else {
			return ( combi(n - 1, r - 1) + combi(n - 1, r)) % modAns;
		}
	}
}
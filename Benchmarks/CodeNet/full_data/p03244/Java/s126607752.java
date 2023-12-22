
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];


		Map<Integer, Integer> even = new HashMap<>();//i = even
		Map<Integer, Integer> odd = new HashMap<>();//i = odd
		even.put(-1, 0);
		odd.put(-2, 0);

		for(int i = 0; i < N; i++) {
			int thenum = sc.nextInt();
			num[i] = thenum;
			if(i % 2 == 0) {
				//even
				if(even.containsKey(thenum)) {
					even.put(thenum, even.get(thenum) + 1);
				}else {
					even.put(thenum, 1);
				}
			}else {
				//odd
				if(odd.containsKey(thenum)) {
					odd.put(thenum, odd.get(thenum) + 1);
				}else {
					odd.put(thenum, 1);
				}
			}
		}
		int fastest = 100000;

		for(int c0: even.keySet()) {
			for(int c1: odd.keySet()) {
				if(c0 == c1)continue;

				int take = N - (even.get(c0) + odd.get(c1));
				if(take < fastest)fastest = take;
			}
		}
		System.out.println(fastest);

	}

}

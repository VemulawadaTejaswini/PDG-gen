import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		HashMap<Long,Integer> num = new HashMap<Long,Integer>();
		for(int i = 0;i < N;i++) {
			long a = scn.nextLong();
			if(num.containsKey(a)) {
				num.replace(a, num.get(a)+1);
			}else {
				num.put(a, 1);
			}
		}
		long ans = 0;
		for(long a:num.keySet()) {
			if(a > num.get(a)) {
				ans+=a;
			}
			if(num.get(a) > a) {
				ans += num.get(a) - a;
			}
		}
		System.out.println(ans);
	}

}

import java.util.*;

public class Main {
	static boolean check(long a,long b,long c,long d) {
		if(a < b)return false;
		if(c + 1 >= b)return true;
		Map<Long,Integer> map = new HashMap<>();
		while(!map.containsKey(a)) {
			map.put(a, 1);
			a -= (a - c) / b * b;
			if(a > c)a -= b;
			if(a < 0)return false;
			a += d;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0;i < t;i ++) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			long d = in.nextLong();
			if(check(a,b,c,d))System.out.println("Yes");
			else System.out.println("No");
		}
	}

}

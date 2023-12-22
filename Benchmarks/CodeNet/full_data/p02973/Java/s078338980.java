import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Long> color = new ArrayList<Long>();
		long small = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			long a = scn.nextLong();
			if(i==0) {
				color.add(a);
				continue;
			}
			int pos = check(color,a);
			if(pos == color.size()-1) {
				if(color.get(color.size()-1) >= a) {
					color.add(a);
					continue;
				}
			}
			if(pos == 1) {
				if(a > color.get(0)) {
					color.set(0, a);
					continue;
				}
			}
			color.set(pos, a);
		}
		System.out.println(color.size());
	}

	public static int check(ArrayList<Long> color, long elem) {
		int upper = 0; // 下限
		int lower = color.size() - 1; // 上限
		while ((lower-upper)>1) {
			int mid = (lower + upper) / 2;
			if(color.get(mid) < elem) {
				lower = mid;
			}else {
				upper = mid;
			}
		}
		return lower;
	}

}

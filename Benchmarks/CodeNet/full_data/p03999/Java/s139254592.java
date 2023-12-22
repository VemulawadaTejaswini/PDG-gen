import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Integer> ary = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			ary.add(Character.getNumericValue(s.charAt(i)));
		}

		int[] c = new int[s.length() - 1];
		for (int i = 0; i < s.length() - 1; i++) {
			c[i] = i;
		}
		List<Long> finalList = new ArrayList<Long>();
		for (int i = 0; i < 1 << c.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < c.length; j++) {
				if ((i >> j & 1) == 1) {
					list.add(c[j]);
				}
			}
			long ret = 0;
			for (int j = 0; j < ary.size(); j++) {
				if (ret == 0) {
					ret += ary.get(j);
				} else {
					ret = ret * 10 + ary.get(j);
				}
				if (list.contains(j)) {
					finalList.add(ret);
					ret = 0;
				}
			}
			finalList.add(ret);
		}
		long out = 0;
		for (long in : finalList) {
			out += in;
		}
		System.out.println(out);
	}

}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Long> list = new ArrayList<Long>();
	static {
		long t = 1;
		while(list.size() <= 100001) {
			if (isLunlun(t)) {
				list.add(t);
			}
			t++;
		}
	}
	static boolean isLunlun(long n) {
		String z = n + "";
		for(int i=0;i+1<z.length();i++) {
			if (z.charAt(i+1) - z.charAt(i) >= 2) return false;
		}
		return true;
	}
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(list.get(k));
	}
}

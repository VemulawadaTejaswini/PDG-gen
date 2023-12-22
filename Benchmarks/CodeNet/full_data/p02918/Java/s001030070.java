import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		char cur = S.charAt(0);
		int len = 1;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1 ; i < S.length() ; ++i) {
			char ci = S.charAt(i);
			if(cur != ci) {
				list.add(len);
				len = 0;
			}
			++len;
			cur = ci;
		}
		list.add(len);
		int H = 0;
		for(int i : list) {
			H += i - 1;
		}
//		System.out.println(list);
		int ret = Math.min(N - 1, H + 2 * K);
		System.out.println(ret);
		// R L R L R L
		// LLLRRL
	}
}

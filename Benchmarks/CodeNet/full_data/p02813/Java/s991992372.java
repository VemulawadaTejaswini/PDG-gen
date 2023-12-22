import java.util.*;
import java.math.*;
public class Main {
	static int counter = 0;
	static int st = -1;
	static int nd = -1;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String a = "";
		String b = "";
		for(int i = 0; i < n; i++) a += in.nextInt() + "";
		for(int i = 0; i < n; i++) b += in.nextInt() + "";
		int[] cur = new int[n];
		boolean[] check = new boolean[n];
		count(cur, n, check, 0, a, b);
		if(nd == -1) nd = st;
		System.out.println(Math.abs(st - nd));
	}
	public static void count(int[] cur, int n, boolean check[], int index, String a, String b) {
		if(index == n) {
			counter += 1;
			String possibility = "";
			for(int i = 0; i < n; i++) {
				possibility += cur[i];
			}
			if((possibility.equals(a)) || (possibility.equals(b))) {
				if(st == -1) {
					st = counter;
				}else {
					nd = counter;
				}
			}
			return;
		}
		for(int i = 1; i <= n; i++) {
			if(check[i - 1] == false) {
				check[i - 1] = true;
				cur[index] = i;
				count(cur, n, check, index + 1, a, b);
				check[i - 1] = false;
			}
		}
	}
}
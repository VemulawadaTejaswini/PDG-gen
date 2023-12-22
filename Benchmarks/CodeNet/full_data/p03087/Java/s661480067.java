import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			String t = s.substring(l[i] - 1, r[i]);
			int count = 0;
			int bi = 0;
			while (t.indexOf("AC", bi) != -1) {
				bi = t.indexOf("AC", bi) + 1;
				count++;
			}
			System.out.println(count);
		}
	}
}
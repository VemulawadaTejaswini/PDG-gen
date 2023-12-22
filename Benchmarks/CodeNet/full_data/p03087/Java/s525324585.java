import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		String s = sc.next();
		int[] AC = new int[s.length()];
		AC[0] = 0;
		for(int i = 1;i < s.length();i ++) {
			AC[i] = AC[i-1];
			char c1 = s.charAt(i-1),c2 = s.charAt(i);
			if(c1 == 'A' && c2 == 'C') {
				AC[i] ++;
			}
		}
		System.out.println(Arrays.toString(AC));
		for(int i = 0;i < q;i ++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			int ans = AC[R-1] - AC[L-1];
			System.out.println(ans);
		}
	}
}
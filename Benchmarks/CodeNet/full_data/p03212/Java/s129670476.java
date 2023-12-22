
import java.util.Scanner;

public class Main {
	static char[] numlist1 = {'0','1','2','4','6','8','9'};
	static char[] numlist2 = {'3','5','7'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		out: for (int i = 357; i <= N; i++) {
			char[] s = String.valueOf(i).toCharArray();
			for (char othernum : numlist1) {
				for (char schar : s) {
					if (schar == othernum) {
						continue out;
					}
				}
			}
			boolean[] flags = new boolean[3];
			for (int j = 0; j < numlist2.length; j++) {
				for (char schar : s) {
					if (schar == numlist2[j]) {
						flags[j] = true;
					}
				}
			}
			if (flags[0] && flags[1] &&flags[2]) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}

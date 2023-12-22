import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
long ans=0;
		String con;
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			con = sc.next();
			char[] c = con.toCharArray();
			Arrays.sort(c);
			s[i] = String.valueOf(c);
		}

		Arrays.sort(s);
		int how = 1;
		for (int i = 0; i < s.length - 1; i++) {
			if (!s[i].equals(s[i + 1])) {
				how++;
			}
		}
		int x[] = new int[how];
		Renzoku(s, x);

		for (int i = 0; i < how; i++) {
			ans+=con(x[i],2);
		}
		System.out.println(ans);
	}

	public static int Renzoku(String c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i].equals(c[i + 1])) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i].equals(c[i + 1])) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if (!(c[i].equals(c[i + 1])) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}

	static public long con(int n, long r) {
		long num = 1;
		for (long i = 1; i <= r; i++) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}

}
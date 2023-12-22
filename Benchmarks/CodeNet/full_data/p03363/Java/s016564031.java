import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] s = new long[n + 1];
		s[0] = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			s[i + 1] = a[i] + s[i];
		}

		Arrays.sort(s);
		//for (int i = 0; i < n + 1; i++) {
		//System.out.print(s[i]);
		//System.out.print(" ");
		//}
		//System.out.println(" ");
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			while (i + count < n && s[i] == s[i + count + 1]) {
				count++;
			}
			if (count > 0) answer += count * (count + 1) / 2;
			i += count;
		}

		System.out.println(answer);
	}
}

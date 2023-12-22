import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] s = new int[N];
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			s[i] = in.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		int ans = sum;
		int index = 0;
		while (index < s.length && ans % 10 == 0) {
			ans -= s[index];
			index++;
		}
		System.out.println(ans);
		in.close();

	}

}
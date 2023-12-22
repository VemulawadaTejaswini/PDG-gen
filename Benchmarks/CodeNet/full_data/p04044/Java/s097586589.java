import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt(); // 使用しない

		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		sc.close();

		Arrays.sort(s);

		String sum = "";
		for (String str : s) {
			sum += str;
		}

		System.out.println(sum);
	}
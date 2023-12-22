import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = new String[4];
		for (int i = 0; i < 4; i++) {
			num[i] = sc.next();
		}
		Arrays.sort(num);
		StringBuilder s = new StringBuilder(4);
		for(String sss:num)
			s.append(sss);
		System.out.println(s.toString());

		if ("1479".equals(s.toString())) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");

		long sum = 0;
		for(int i = 0;i < (1 << s.length - 1);i++) {
			String subStr = "";
			for(int j = 0;j < s.length;j++) {
				if((i >> j & 1) == 1) {
					subStr += s[j];
					sum += Long.parseLong(subStr);
					subStr = "";
				}
				else {
					subStr += s[j];
				}
			}

			sum += Long.parseLong(subStr);
		}

		System.out.println(sum);
    }
}
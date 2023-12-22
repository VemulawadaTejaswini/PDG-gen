import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double answer = 0;

		for (int i = 0; i < N; i++) {
			double num = Double.valueOf(sc.next());
			String str = sc.next();
			if ("JPY".equals(str)) {
				answer += num;
			} else {
				answer += num * 380000;
			}
		}

		System.out.println(answer);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] accepted = new boolean[n];
		int answer = 0;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			String s = sc.nextLine();
			sc.nextLine();
			if (accepted[x]) continue;

			if (s.equals("AC")) {
				accepted[x] = true;
			} else {
				answer++;
			}
		}
		System.out.println(answer);
	}
}

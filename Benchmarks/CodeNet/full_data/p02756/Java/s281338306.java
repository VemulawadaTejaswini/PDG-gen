import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean isReverce = false;

		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				isReverce = !isReverce;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if ((f == 1 && !isReverce) || (f == 2 && isReverce)) {
					answer = c + answer;
				} else {
					answer = answer + c;
				}
			}
		}
		sc.close();

		if (isReverce) {
			StringBuffer sb = new StringBuffer(answer);
			answer = sb.reverse().toString();
		}

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}

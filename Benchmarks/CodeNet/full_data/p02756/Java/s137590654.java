import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.next();
		int N = Integer.parseInt(sc.next());

		for (int i = 0; i < N; i++) {
			int T =sc.nextInt();
			if (T == 1) {
				String top = string.substring(0,1);
				String end = string.substring(string.length() - 1,string.length());
				if (string.length() > 2) {
					String mid = string.substring(1, string.length() - 1);
					string = end + mid + top;
				}else if (string.length() == 2) {
					string = end + top;
				}else{
					string = string;
				}
			}else {
				int F = sc.nextInt();
				if (T == 2 && F == 1) {
					String top = sc.next();
					string = top + string;
				}else if (T == 2 && F == 2) {
					String end = sc.next();
					string = string + end;
				}
			}
		}

		System.out.println(string);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String s = in.next();
		int index = 0;
		StringBuilder ans = new StringBuilder();
		while (index < N) {
			int preCount = 0;
			int sufCount = 0;
			while (index < N && s.charAt(index) == '(') {
				preCount++;
				index++;
			}
			while (index < N && s.charAt(index) == ')') {
				sufCount++;
				index++;
			}

			for (int i = 0; i < Math.max(preCount, sufCount); i++) {
				ans.append('(');
			}
			for (int i = 0; i < Math.max(preCount, sufCount); i++) {
				ans.append(')');
			}
		}
		System.out.println(ans.toString());
		in.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long max = 0;
		boolean isYes = true;

		for(int i = 0; i < n; i++) {
			long tmp = in.nextInt();

			if(max < tmp) {
				max = tmp -1;
			}else if(max == tmp) {

			}else {
				isYes = false;
				break;
			}
		}

		String ans = (isYes) ? "Yes" : "No";

		System.out.println(ans);
	}
}
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();

		int cntE = 0;
		int cntW = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'E')
				cntE++;
		}

		int min = 1000000000;
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			if (s.charAt(i) == 'E') {
				cntE--;
				tmp = cntE + cntW;
			} else {
				tmp = cntE + cntW;
				cntW++;
			}
			min = Math.min(min, tmp);
		}

		System.out.println(min);
	}
}

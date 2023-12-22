import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] aArray = new int[n];
		for (int i = 0; i < n; i++) {
			aArray[i] = scan.nextInt();
		}

		int opeCount = 0;
		end: while (true) {
		for (int i = 0; i < n; i++) {
			if (aArray[i] % 2 == 0) {
				aArray[i] = aArray[i] / 2;
			} else {
				break end;
			}
		}
		opeCount++;
		}
		System.out.println(opeCount);

}

import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] aArray = new int[n];
		for (int i = 0; i < n; i++) {
			aArray[i] = scan.nextInt();
		}
		scan.close();

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int add = 0;
				for (int k = i; k <= j; k++) {
					add += aArray[k];
				}
				if (add == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

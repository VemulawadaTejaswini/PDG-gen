import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] N = sc.nextLine().toCharArray();
		sc.close();
		int count = 0;
		int noCount = 0;
		for (int i = 0; i < N.length; i++) {
			if (i + 1 < N.length) {
				if (N[i] == N[i + 1]) {
					count++;
					if (count == 2) {
						break;
					}
				} else {
					if (count != 2) {
						noCount++;
						count = 0;
					}
				}
			}
		}
		
		if (count == 0 && noCount > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
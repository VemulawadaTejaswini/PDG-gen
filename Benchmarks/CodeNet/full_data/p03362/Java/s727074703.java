import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cout = 1;
		System.out.println(2 + " ");
		for (int i = 3;; i++) {
			boolean isSosu;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				} else if(j == i - 1) {
					System.out.println(i + " ");
					cout++;
				}
			}
			if (cout == n)
				return;
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = sc.nextInt();
		int q = sc.nextInt();
		
		int[] answer = new int[q];
		int[] cnt = new int[n];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				if (answer[i] == j) {
					cnt[j - 1]++;
				}
			}
		}
		
		for (int i : cnt) {
			if (sp - (q - i) <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
		
	}
}
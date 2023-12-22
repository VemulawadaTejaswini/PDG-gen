import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int K = sc.nextInt();
		
		int[] array = {a, b, c};
		int max = 0;
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		int m = K * 2;
		int answer = 0;
		for (int j : array) {
			if (max == j) {
				answer += max * m;
			} else {
				answer += j;
			}
		}
		System.out.println(answer);
	}
}
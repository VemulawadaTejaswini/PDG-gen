import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int answer = 0;
		String nStr = "";
		for (int i = 1; i < N; i+=2) {
			nStr = String.valueOf(i);
			if (nStr.indexOf('1') == -1 && nStr.indexOf('9') == -1) answer++;
		}

		System.out.println(answer);
	}
}
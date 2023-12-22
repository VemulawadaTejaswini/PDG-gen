import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.next().split("");
		String[] T = sc.next().split("");
		int answer = 0;

		for (int i = 0; i < S.length; i++) {
			if (S[i].equals(T[i])) answer++;
		}

		System.out.println(answer);
	}
}

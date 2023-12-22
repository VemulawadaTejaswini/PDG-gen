import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long C = sc.nextLong();
		long scc = 0;
		if (S * 2 <= C) {
			C -= S * 2;
			scc += S;
		} else if (C >= 2) {
			C -= C % 2;
			scc += C / 2;
		}
		if (C >= 4) {
			scc += C / 4;
		}
		System.out.println(scc);
	}

}
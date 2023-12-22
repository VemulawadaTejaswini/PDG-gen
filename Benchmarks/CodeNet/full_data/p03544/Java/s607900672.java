import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] ryuka = new long[N	+1];
		ryuka[0] = 2;
		ryuka[1] = 1;
		for (int i = 2; i <= N; i++) {
			ryuka[i] = ryuka[i - 1] + ryuka[i - 2];
		}
		System.out.print(ryuka[N]);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] arrayHomework = new int[M];

		for (int i = 0; i < M; i++) {
			arrayHomework[i] = Integer.parseInt(sc.next());
			N -= arrayHomework[i];
		}
		sc.close();

		System.out.println(N >= 0 ? N : -1);

	}

}

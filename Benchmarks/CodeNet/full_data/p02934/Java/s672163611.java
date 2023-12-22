import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextLine());
		double sum = 0;
		for(int i = 0; i < N; i++)
			sum = 1 / in.nextDouble();
		System.out.println(1 / sum);
	}
}

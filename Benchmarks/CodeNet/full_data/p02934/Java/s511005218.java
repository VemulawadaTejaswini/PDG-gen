import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] number = new double[N];
		
		for (int i = 0; i < N; i++) {
			number[i] = scan.nextInt();
		}
		
		System.out.println((1 / number[0]));
		System.out.println(1 / number[number.length - 1]);
		
		double total = (1 / number[0] + 1 / number[number.length - 1]) * number.length / 2;
		
		double answer = 1 / total;
		
		System.out.println(answer);
	}
}
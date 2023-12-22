import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] number = new int[N];
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			number[i] = scan.nextInt();
			sum += (double)1 / number[i];
		}
	
		System.out.println(1 / sum);
	}
}
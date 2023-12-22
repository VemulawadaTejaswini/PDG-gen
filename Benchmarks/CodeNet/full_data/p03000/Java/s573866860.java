import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int counter = 1;
		double sum = 0;
		
		for (int count = 0; count < N; count++) {
			int input = scan.nextInt();
			sum += input;
			if(sum <= X) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

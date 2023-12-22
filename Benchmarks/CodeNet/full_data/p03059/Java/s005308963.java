import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int T = scanner.nextInt();
		int answer = 0;
		while (A++ < T + 0.5){
			
			B++;
			answer = B;
		}
		
		System.out.println(answer);
	}
}
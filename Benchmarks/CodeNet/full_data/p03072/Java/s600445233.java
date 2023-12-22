import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = 0;
		int max = 0;
		
		for (int i = N; i > 0; i-- ){
			
			int H = scanner.nextInt();
			if (H >= max) {
				max = H;
				answer = answer + 1;
			}
		}
		System.out.println(answer);
	}
}
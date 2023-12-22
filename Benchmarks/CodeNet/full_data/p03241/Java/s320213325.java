import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		for(int i = (int)Math.sqrt(M); i > 0; i--) {
			if(M % i == 0 && i <= M / N) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
}
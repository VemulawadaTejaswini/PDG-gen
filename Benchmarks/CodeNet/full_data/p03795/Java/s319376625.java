import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int receiveCount = 0;
		int receive = 0;
		receiveCount = N / 15;
		receive = receiveCount * 200;
		
		System.out.println(N * 800 - receive);
	}
}
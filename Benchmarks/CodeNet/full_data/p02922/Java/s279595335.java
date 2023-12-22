import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(power_socket(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}
	
	public static int power_socket(int a, int b) {
		int taps = 0;
		int sockets = 1;
		while(sockets < b) {
			sockets += a - 1;
			taps++;
		}
		return taps;
	}

}
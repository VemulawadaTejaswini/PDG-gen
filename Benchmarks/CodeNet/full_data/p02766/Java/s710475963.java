import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		long rate = scanner.nextInt();
		int count = 0;
		while(num != 0) {
			num /= rate;
			count++;
		}
		System.out.println(count);
	}

}

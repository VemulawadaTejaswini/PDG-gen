
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = x/500;
		x = x % 500;
		long b = x/5;
		System.out.println(a*1000 + b*5);
		sc.close();
	}
}

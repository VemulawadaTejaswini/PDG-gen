import java.util.Scanner;

public class Main {
	void run() {
		long n, min = Long.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		n = scan.nextLong();
		for (int i = 0; i < 5; i++)
			min = Math.min(min, scan.nextLong());
		System.out.println(5 + (n / min));
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}

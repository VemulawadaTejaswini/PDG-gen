import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int t = scan.nextInt();
		System.out.println((t/a)*b);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}

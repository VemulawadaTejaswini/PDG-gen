
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int n = sc.nextInt();
			
			if (d == 0) {
				if (n == 100) {
					System.out.println(101);
				} else {
					System.out.println(n);
				}
			} else {
				long num = 100;
				if (d == 2) {
					num *= 100;
				}
				if (n == 100) {
					System.out.println(num * 101);
				} else {
					System.out.println(num * n);
				}
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int k = scanner.nextInt();
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int count = 0;
		
		d1 = b - a;
		d2 = c - b;
		d3 = d - c;
		d4 = e - d;
		
		if (d1 >= k) {
			count += 1;
		} else if (d2 >= k) {
			count += 1;
		} else if (d3 >= k) {
			count += 1;
		} else if (d4 >= k) {
			count += 1;
		}
		
		if (count != 0) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int r = 0;
		r =  k;
		for (int i = 1; i < n; i++) {
			r = r*(k-1);
		}
		System.out.println(r);
	}
}

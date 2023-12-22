import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int X = scan.nextInt();
		scan.close();
		int k = A + B - X;
		int t = X - A;
		if(k >= 0 && t >= 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
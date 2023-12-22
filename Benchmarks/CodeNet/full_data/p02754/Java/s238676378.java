import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int lineA = 0;
		int lineB = 0;
		while((lineA + lineB) < n) {
			lineA += a;
			lineB += b;
		}
		if((lineA + lineB) == n) {
			System.out.print(lineA);
		}else {
			lineA -=a;
			lineB -= b;
			int s = n - (lineA + lineB);
			if( a > s) {
				System.out.println(lineA + s);
			}else {
				System.out.println(lineA + a);
			}
		}

	}

}

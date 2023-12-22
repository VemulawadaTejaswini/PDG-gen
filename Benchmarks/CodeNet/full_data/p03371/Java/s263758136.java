import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int AB = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		System.out.println(search(A,B,AB,X,Y));
	}

	public static int search(int A,int B,int AB,int X,int Y) {
		int ans = Integer.MAX_VALUE;
		int I = X>Y? X : Y;

		for(int i = 0; i <= I; i++) {
			int a = Math.max(X - i,0);
			int b = Math.max(Y - i,0);
			ans = Math.min(ans,a*A + b*B + 2*i*AB);
		}
		return ans;
	}
}

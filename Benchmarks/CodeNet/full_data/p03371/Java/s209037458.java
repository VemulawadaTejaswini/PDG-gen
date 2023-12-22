import java.util.Scanner;

public class Main{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt()*2;
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans1 = C*Math.max(X,Y);
		int ans2 = C*Math.min(X,Y);
		if(X<Y) {
			ans2 += Math.abs(Y-X)*B;
		} else {
			ans2 += Math.abs(Y-X)*A;
		}
		int ans3= A*X+B*Y;
		System.out.println(Math.min(ans1,Math.min(ans2, ans3)));
	}
}
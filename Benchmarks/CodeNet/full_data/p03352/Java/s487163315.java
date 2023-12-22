import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		scan.close();
		int ans = (int)Math.sqrt(X);
		System.out.println(ans * ans);
	}
}
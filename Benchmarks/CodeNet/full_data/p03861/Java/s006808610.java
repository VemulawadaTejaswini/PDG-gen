import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();
		long ans;
		
		if(a == 0)
			ans = b / x - a / x;
		else
			ans = b / x - (a - 1) / x;
		
		System.out.println(ans);
	}
}
import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt() * 2 + 1;
		sc.close();
		
		System.out.println((n + d - 1)/d);
	}
}
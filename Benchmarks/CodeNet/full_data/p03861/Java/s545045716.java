import java.util.Scanner;

public class Main {
	public static void Main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int x =sc.nextInt();
		sc.close();
		int count = 0;
		int s = a/x;
		int e = b/x;
		count = e-s;
		System.out.println(count);
	}
}

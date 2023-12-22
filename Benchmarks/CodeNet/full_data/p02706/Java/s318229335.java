import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d;
		for ( int i=0; i<m; i++) {
			d = sc.nextInt();
			n -= d;
		}
		if (n < 0) {
			n = -1;
		}


		sc.close();
		System.out.println(n);
	}
}

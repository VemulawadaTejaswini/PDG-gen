import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long l0 = 2;
		long l1 = 1;
		long ln=0;
		if (n>=2) {
			for (int i =2;i<=n;i++) {
				ln = l1+l0;
				l0=l1;
				l1=ln;
			}
		}
		System.out.println(ln);
	}
}
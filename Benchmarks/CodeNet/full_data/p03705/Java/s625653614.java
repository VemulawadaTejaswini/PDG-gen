import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (N==1&&A!=B) {
			System.out.println(0);
			return ;
		}
		if (A>B) {
			System.out.println(0);
			return ;
		}
		long temp = N-2;
		System.out.println(temp*B-temp*A+1);
	}
}
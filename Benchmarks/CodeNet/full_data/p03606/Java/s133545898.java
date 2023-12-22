import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int N = 0,l = 0,r = 0,result = 0;

		N = sc.nextInt();
		for(int x = 1 ; x <= N ; x++) {
			l = sc.nextInt();
			r = sc.nextInt();
			l--;
			result += Math.abs(l - r);
		}
		System.out.println(result);
	}
}

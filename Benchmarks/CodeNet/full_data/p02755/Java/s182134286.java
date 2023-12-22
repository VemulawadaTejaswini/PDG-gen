import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt();
		double b = sc.nextInt();

		double tmp = Math.ceil(b/ 0.1);
		int x = (int)(tmp * 0.08);

		if(x == a) {
			System.out.println((int)tmp);
		}else {
			System.out.println(-1);
		}
	}
}

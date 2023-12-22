import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		double aa = Math.sqrt(a);
		double bb = Math.sqrt(b);
		double cc = Math.sqrt(c);


		if(aa + bb < cc) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static double sqrtFloor(long x) {
		double y = Math.sqrt(x);
		return x >= y * y ? y : y - 1;
	}
}

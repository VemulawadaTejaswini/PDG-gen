import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double f = Math.min(x * H, (W - x) * H);
		double s = Math.min(y * W, (H - y) * W);
		double area = Math.max(f, s);
		boolean isSameArea = f == s ? true : false;
		System.out.println(String.format("%.9f", area));
		System.out.println(isSameArea ? 1 : 0);

		sc.close();
	}
}
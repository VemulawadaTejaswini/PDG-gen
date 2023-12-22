import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double S1 = 0, S2 = 0;
		if (x <= w / 2) {
			S1 = (x * h);
		} else {
			S1 = ((w - x) * h);
		}
		if (y <= h / 2) {
			S2 = (y * w);
		} else {
			S2 = ((h - y) * w);
		}
		if (S1 <= S2)
			System.out.printf("%f ", S2);
		else 
			System.out.printf("%f ", S1);
		if (S1 == S2)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
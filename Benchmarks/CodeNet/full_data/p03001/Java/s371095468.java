import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		double wS = (long)x * h;
		double wSOther = w * h - wS;
		double wSa = Math.abs(wS - wSOther);
		double hS = (long)w * y;
		double hSOther = w * h - hS;
		double hSa = Math.abs(hS - hSOther);
		double ans = 0d;
		String judge = "0";
		if(wSa < hSa) {
			ans = wS < wSOther ? wS : wSOther;
			if(h / 2 == (double)y) {
				judge = "1";
			}
		} else if(hSa < wSa) {
			ans = hS < hSOther ? hS : hSOther;
			if(w / 2 == (double)x) {
				judge = "1";
			}
		} else {
			ans = wS;
			judge = "1";
		}
		System.out.println(ans + " " + judge);

		sc.close();

	}

}

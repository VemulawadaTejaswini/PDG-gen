import java.util.Scanner;

public class Main{

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		int tate = 0;
		int yoko = 0;

		for (int index=0; index<N; index++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x+y>0) {
				yoko += x;
				tate += y;
			}
		}
		double num = Math.sqrt((Math.pow(yoko, 2)+Math.pow(tate,2)));

		System.out.println(num);

	}
}
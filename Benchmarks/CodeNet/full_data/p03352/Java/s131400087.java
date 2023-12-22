import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int max = 0;

		Scanner scan = new Scanner(System.in);
		x = Integer.parseInt(scan.next());

		for(int i = 1 ; i <= x ; i++) {
			double num = Math.sqrt(i);
			int h1 = (int)num;
			double h2 = (double)h1;

			if(num == h2) {
				max = i;
			}

			double num2 = Math.cbrt(i);
			int c1 = (int)num2;
			double c2 = (double)c1;

			if(num2 == c2) {
				max = i;
			}


		}
		System.out.println(max);

	}
}
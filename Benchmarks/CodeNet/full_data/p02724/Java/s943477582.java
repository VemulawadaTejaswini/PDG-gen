import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();
		int uresi500 = 1000;
		int uresi5 = 5;
		int count500 = 0;
		int count5 = 0;


		do {
			x -= 500;
			count500++;
		}while(x >= 500);

		do {
			x -= 5;
			count5++;
		}while(x >= 5);

		int re = count500*uresi500 + count5*uresi5;

		System.out.println(re);

	}

}

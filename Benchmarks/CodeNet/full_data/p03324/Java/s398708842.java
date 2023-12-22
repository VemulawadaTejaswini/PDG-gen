import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int d,n;
			d=scan.nextInt();
			n=scan.nextInt();
			scan.close();
			System.out.println(n*Math.pow(10, d));

		}
}
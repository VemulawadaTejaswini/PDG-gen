import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double t = 1.08;
		double x = n/t;
		x = Math.ceil(x);
		if(Math.floor(x*t) == n) {
			System.out.println((int)x);
		}else {
			System.out.println(":(");
		}

		sc.close();
	}
}
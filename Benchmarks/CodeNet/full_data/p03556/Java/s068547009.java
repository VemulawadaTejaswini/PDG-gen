import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		long qd = (long) Math.pow(Math.floor(Math.sqrt(d)), 2);

		System.out.println(qd);
	}
}

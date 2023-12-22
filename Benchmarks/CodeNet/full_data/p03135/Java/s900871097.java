import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double T = sc.nextDouble();
		double X = sc.nextDouble();
		sc.close();
		System.out.println(T/X);
	}

}
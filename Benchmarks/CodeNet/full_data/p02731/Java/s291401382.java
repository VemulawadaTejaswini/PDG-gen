import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();
		double l = L/3;
		System.out.printf("%12f",l*l*l);
	}

}
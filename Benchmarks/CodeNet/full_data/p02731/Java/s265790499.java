import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double len = sc.nextDouble();

		System.out.println(Math.pow(len/3 , 3));

		sc.close();
	}
}

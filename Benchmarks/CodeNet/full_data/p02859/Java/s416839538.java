import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		sc.close();

		int p = 3;

		int x = p * r * r;

		int a = x / p;

		System.out.println(a);


	}


}

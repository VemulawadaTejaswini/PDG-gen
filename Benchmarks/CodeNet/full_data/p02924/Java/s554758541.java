import java.util.Scanner;

public class Main{

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		long amari = 0;

		for (int index=1; index<N; index++) {
			amari += index;
		}

		System.out.println(amari);
	}
}
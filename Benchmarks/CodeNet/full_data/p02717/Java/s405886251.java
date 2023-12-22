import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int Z = scan.nextInt();

		System.out.println(Z + " " + X + " " + Y);
	}
}
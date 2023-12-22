import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int prize = 0;
		if ( X == 1 || X == 2 || X == 3 ) {
			prize += (4 - X) * 100000;
		}
		if ( Y == 1 || Y == 2 || Y == 3 ) {
			prize += (4 - Y) * 100000;
		}
		if ( X == 1 && Y == 1 ) {
			prize += 400000;
		}
		
		System.out.println(prize);
	}
}

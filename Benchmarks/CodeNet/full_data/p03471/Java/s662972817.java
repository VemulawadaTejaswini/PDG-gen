import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();
		int t = 0;
		int ft = 0;
		int tt = 0;

		int x = Y / 10000;

		Y = Y % 10000;

		int y = Y / 5000;

		Y = Y % 5000;

		int z = Y / 1000;

		if (x + y + z > N ){
			System.out.println("-1 -1 -1");
		} else if ( x == 0 && y == 0 && z == 0){
			System.out.println("-1 -1 -1");
		} else {
			System.out.println(x + " " + y + " " + z);
		}


	}

}

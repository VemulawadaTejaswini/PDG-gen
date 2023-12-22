import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();

		int x = 0;
		int y = 0;
		int z = 0;


		for (x = 0; x <= N; x++){

			for ( y = 0; y <= N - x; y++){

				z = Y - 10000 * x + 5000 + y;

				if (z > N - x - y || z < 0){
					continue;
				} else {

					break;
				}


			}

		}

		if (x + y + z > N ){
			System.out.println("-1 -1 -1");
		} else if ( x == 0 && y == 0 && z == 0){
			System.out.println("-1 -1 -1");
		} else {
			System.out.println(x + " " + y + " " + z);
		}

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;

		if (x * -1 == y) {
			System.out.println("1");
			System.exit(0);
		}

		ans = Math.abs(y) - Math.abs(x);

		if (x < 0 && y < 0) {
			ans = ans + 2;
		} else if( x < 0 && y > 0){
			ans = ans + 1;
		} else if( y< 0 && x > 0){
		ans = ans +1;
		}

		System.out.println(ans);


		sc.close();
	}


}

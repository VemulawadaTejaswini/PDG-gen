import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;

		if (x >= 0 && y >= 0){
			if ( x < y) {
				ans = y - x;
			} else {
				ans = y + x + 1;
			}
			System.out.println(ans);
			System.exit(0);

		}


		if (x < 0 && y < 0) {
			if ( x > y) {
				ans = Math.abs(y) - Math.abs(x) + 2;
			} else {
				ans = Math.abs(x) - Math.abs(y);
			}

			System.out.println(ans);
			System.exit(0);
		}


		if (x > y) {
				if ( x > Math.abs(y)){
					ans = x - Math.abs(y) +1;
				}else {

				ans = Math.abs(y) - Math.abs(x) + 1;
				}
		} else {

			if (Math.abs(x) < y){
				ans = y - Math.abs(x) + 1;
			}else if (y != 0) {
				ans = Math.abs(x) - Math.abs(y) + 1;
			} else {
				ans = Math.abs(x) - Math.abs(y);
			}
		}
		System.out.println(ans);
		System.exit(0);

		sc.close();
	}


}

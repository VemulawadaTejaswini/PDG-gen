
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();

		int ret = 0;
		for(int i = 1 ; i <= n ; i++) {

			if(String.valueOf(i).length() % 2 == 1) {

				ret++;

			}

		}
		System.out.println(ret);

	}

}

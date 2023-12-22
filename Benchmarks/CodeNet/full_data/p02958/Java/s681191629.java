
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[n];
		int flag = 0;
		int count = 0;
		for(int i = 1; i <= n; i++) {

			int a = Integer.parseInt(temp[i - 1]);

			if(a != i){

				count++;

				int b = Integer.parseInt(temp[n - i]);
				if(a == n - i + 1 && b == i) {
					flag ++;
				}

			}


		}


		if(flag == 2 || count == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}

	}
}

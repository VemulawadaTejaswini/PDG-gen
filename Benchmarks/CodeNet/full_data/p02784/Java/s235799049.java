import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp   = scanner.nextLine().split(" ");
		int h = Integer.parseInt(temp[0]);
		int n = Integer.parseInt(temp[1]);
		String[] temp2  = scanner.nextLine().split(" ");
		int sum = 0;

		for(int i = 0; i < n; i++) {

			sum += Integer.parseInt(temp2[i]);

			if(h <= sum ) {

				System.out.println("Yes");
				return;

			}

		}

		System.out.println("No");


	}

}
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		int[] xlist = new int[n];
		int[] ylist = new int[n];

		for(int i = 0; i < n; i++) {

			String[] temp = scanner.nextLine().split(" ");

			xlist[i] = Integer.parseInt(temp[0]);
			ylist[i] = Integer.parseInt(temp[1]);

		}


		double ans = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {

				ans += Math.sqrt(Math.pow(xlist[i] - xlist[j], 2) + Math.pow(ylist[i] - ylist[j], 2));

			}
		}



		System.out.println(ans / n);
	}

}

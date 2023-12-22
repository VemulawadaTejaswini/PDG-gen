import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		String[] ctemp = scanner.nextLine().split(" ");
		String[] htemp = scanner.nextLine().split(" ");
		int[] city = new int[n + 1];
		int[] hero = new int[n];

		int ans = 0;

		for(int i = 0; i < n; i++) {

			city[i] = Integer.parseInt(ctemp[i]);
			hero[i]     = Integer.parseInt(htemp[i]);
		}

		city[n] = Integer.parseInt(ctemp[n]);

		for(int i = n - 1; i >= 0; i--) {

			int sum = city[i + 1] + city[i] - hero[i];

			if(sum > 0) {

				city[i] = sum;
				ans    += hero[i];

			}else if(city[i + 1] > hero[i]){

				ans    += hero[i];


			}else {

				while(city[i + 1] > 0 && hero[i] > 0) {

					city[i + 1]--;
					hero[i]--;
					ans++;

				}

				while(city[i] > 0 && hero[i] > 0) {

					city[i]--;
					hero[i]--;
					ans++;

				}

			}
		}

		System.out.println(ans);

	}
}

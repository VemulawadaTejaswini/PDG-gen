import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		int[] list = new int[n];

		int max  = 0;
		int smax = 0;

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(scanner.nextLine());
			max = Math.max(max, list[i]);
		}


		for(int i = 0; i < n; i++) {

			if(list[i] != max) {
				smax = Math.max(smax, list[i]);
				System.out.println(smax);

			}


		}


		smax = smax == 0 ? max : smax;

		for(int i = 0; i < n; i++) {


			if(list[i] != max) {

				System.out.println(max);

			}else{

				System.out.println(smax);

			}

		}




	}
}

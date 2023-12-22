import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		int[] a = new int[n];
		int[] b = new int[n];



		for (int i = 0; i < n; i++) {

			p[i] = sc.nextInt();
			a[i] = i + 1;
			b[i] = n - i;

		}




		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){

				if (j > p[i] - 1) {
					a[j] = a[j]  + (n - i);


				}


				if (j < p[i] - 1) {

					b[j] = b[j] + (n - i);
				}



			}
		}

	for (int i = 0; i < n; i++) {
		if (i != 0) System.out.print(" ");
		System.out.print(a[i]);


	}

	System.out.println("");
	for (int i = 0; i < n; i++) {
		if (i != 0) System.out.print(" ");
		System.out.print(b[i]);

	}
	System.out.println("");

		sc.close();
	}


}

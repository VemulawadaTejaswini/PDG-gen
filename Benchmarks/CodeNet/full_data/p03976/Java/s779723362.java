import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] P = new char[N];

		int[] table = new int[26];

		for (int i=0; i < table.length;i++)
		{
			table[i]=0;
		}


		int count = 0;
		int open = 0;

		for(int i = 0; i < N ;i++){

			String tmp  = sc.next();

			P[i] = tmp.charAt(0);
			table[(int)P[i] - 65] += 1;

		}

		 Arrays.sort(table);

//		 for (int i = 0; i < 26 ;i++){
//			System.out.println(table[i]);
//		 }


		 for (int j = 0; j < N; j++) {
			 count = 0;
			 Arrays.sort(table);

			 for (int i = 25; i >= 0 ;i--) {

				 if (table[i] > 0){
					 count++;
					 table[i]--;

					 if (count == K){
						 count = 0;
						 open++;

						 break;
					 }
				 }
			 }
		 }








		System.out.println(open);

//		for (int i = 0; i < N ;i++){
//			System.out.println(P[i]);
//		}


		sc.close();
	}


}

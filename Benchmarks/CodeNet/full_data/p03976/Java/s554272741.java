import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] P = new char[N];
		char[] D;
		int flag = 0;
//		int tmp = N/K;


		for(int i = 0; i < N ;i++){

			String tmp  = sc.next();
			P[i] = tmp.charAt(0);

		}

		Arrays.sort(P);
		 D = (char[])P.clone();

		int count = 1;
		int open = 0;
		char a = ' ';
		int back = 0;

		for(int i = 0; i < N ;i++){

			for (int j = 0; j < N; j++) {


				if (j == 0) {
					count = 0;

					if (flag != 1){
						P = (char[])D.clone();
					}
					flag = 0;
					 D = (char[])P.clone();
				}

				if(P[j] == '@') continue;

				if (count == 0) {
					a = P[j];
					back = j;
					count = 1;
					if (count == K){
						open += 1;
						count = 0;
						P[back] = '@';
						flag = 1;
						break;
					}
				} else {
					if(a != P[j]) {
						a = P[j];
						count++;
						P[j] = '@';
						if (count == K) {
							open += 1;
							count = 0;
							P[back] = '@';
							flag = 1;
							break;
						}
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

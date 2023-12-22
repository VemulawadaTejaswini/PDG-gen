import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* A問題
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        int cntBiscuit = 0;

        int time = A;

        for(int i = 2 ; time <= T ; i++) {
        	time = A * i;

        	cntBiscuit += B;
        }

        System.out.println(String.valueOf(cntBiscuit));
        */

		/* B問題
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] intValue = new int[N];
		for(int i = 0 ; i<N ; i++) {
			intValue[i] = sc.nextInt();
		}

		int[] intCost = new int[N];
		for(int i = 0 ; i<N ; i++) {
			intCost[i] = sc.nextInt();
		}

		int maxValue = 0;

		for(int i = 0 ; i < N ; i++) {
			if (intValue[i] > intCost[i]) {
				maxValue += intValue[i] - intCost[i];
			}
		}

		System.out.println(String.valueOf(maxValue));
		*/

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] A = new long[N];
		for(int i = 0 ; i<N ; i++) {
			A[i] = sc.nextLong();
		}

		long num1 = A[0];
		long num2;

		long answer = 0;

		for(int i = 1 ; i < N ; i++) {
			num2 = A[i];

			long m = 0;
			long n = 0;
			long temp = 0;

			if(num1 > num2) {
				m = num1;
				n = num2;

				while(m % n != 0) {

					temp = n;
					n = m % n;
					m = temp;
				}
			}else {
				n = num1;
				m = num2;

				while(m % n != 0) {

					temp = n;
					n = m % n;
					m = temp;
				}
			}

			num1 = temp;
			answer = temp;
		}

		System.out.println(String.valueOf(answer));
	}

}
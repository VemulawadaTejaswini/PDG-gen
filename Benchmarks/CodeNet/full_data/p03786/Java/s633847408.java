

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long a[] = new long[n];
		long sum[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);
		sum[0] = a[0];
//		System.out.print(sum[0] + " ");
		for(int i = 1; i < n; i++){
			sum[i] += a[i] + sum[i - 1];

			//debug
//			System.out.print(sum[i] + " ");
		}
//		System.out.println();

		int result = 1;
		for(int i = n - 2; i >= 0; i--){
			if(sum[i]*2 < a[i + 1]){
//				System.out.println("i = "+i);
				result = n - i - 1;
				break;
			}
			else if(i == 0){
				result = n;
			}
		}

		System.out.println(result);
	}
}

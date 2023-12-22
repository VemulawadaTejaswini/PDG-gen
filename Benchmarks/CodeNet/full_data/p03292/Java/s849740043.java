import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String ars[]) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;

		int[] A = {a,b,c};

		Arrays.sort(A);

		for(int i = 1; i < A.length; i++){
			sum += A[i] - A[i-1];
		}

		System.out.println(sum);

	}

}

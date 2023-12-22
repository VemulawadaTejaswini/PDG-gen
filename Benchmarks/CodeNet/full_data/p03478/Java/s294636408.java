import java.util.*;

public class Main {
	
	private static void solution(int N, int A, int B) {

		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += getBoundedSum(i, A, B);
		}
	}

	private static int getBoundedSum(int value, int A, int B) {

		int sum = 0;

		while(value != 0) {

			int reminder = value % 10;
			sum += reminder;

			if (sum > B) {
				return 0;
			}

			value = value / 10;
		}

		if (sum < A) {
			return 0;
		} else {
			return sum;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		solution(N, A, B);
	}


}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] W = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			W[i] = stdIn.nextInt();
			sum += W[i];
		}
		int min = sum;
		
		for(int i = 0; i < N; i++) {
			int sum1 = 0;
			for(int j = 0; j <= i; j++) {
				sum1 += W[j];
			}
			if(Math.abs(sum1-(sum-sum1)) < min) {
				min = Math.abs(sum1-(sum-sum1));
			}
		}
		System.out.println(min);

	}

}
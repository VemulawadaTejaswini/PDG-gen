import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long ans = 0;
		long sum = 0;
		ans = A + B;
		sum = N - ans;

		if(A == 0){
			System.out.println(0);
		}
		else if(sum > 0){
			System.out.println(A + sum);
		}
		else{
			System.out.println(A);
		}
		stdIn.close();
	}
}

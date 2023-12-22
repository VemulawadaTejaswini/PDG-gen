import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		//Logic
		double total = 0.0;
		double answer = 0.0;

		for(int i = 1; i <= N ; i++) {
			answer = (double)Math.pow(0.5, Math.ceil(Math.log(K/i) / Math.log(2)));
			total += answer;
		}

		//output
		System.out.print(total * (double)1/N);

	}

}

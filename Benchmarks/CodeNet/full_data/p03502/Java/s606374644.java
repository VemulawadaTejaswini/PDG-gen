import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int sum = 0;
		int check = N;
		while(N != 0) {
			sum += N % 10;
			N /= 10;
		}

		if(check % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
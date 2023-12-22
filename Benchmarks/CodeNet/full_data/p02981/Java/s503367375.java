import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();


		if(N * A < N * B){
			System.out.println(N * A);
		}else{
			System.out.println(N * B);
		}

		sc.close();
	}
}

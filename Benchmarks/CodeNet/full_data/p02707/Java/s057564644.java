import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] A = new int[N+1];

		for(int i=2;i<=N;i++) {
			A[i] = scan.nextInt();
		}

		int[] answer = new int[N+1];

		for(int i=1;i<=N;i++) {
			answer[A[i]] += 1;
		}

		for(int i=1;i<=N;i++) {
			System.out.println(answer[i]);
		}

		scan.close();
	}

}

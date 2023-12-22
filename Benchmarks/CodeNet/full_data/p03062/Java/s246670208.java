import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++ ) {
			A[i] = Integer.parseInt(sc.next());
		}

		//Logic
		int answer = 0;
		int minusNum = 0;
		int minNum = 1000000000;
		for(int i = 0 ; i < N ; i++) {
			answer += Math.abs(A[i]);
			if(A[i] < 0) {
				minusNum += 1;
			}
			minNum = Math.min(minNum, Math.abs(A[i]));
		}

		//Output
		if(minusNum % 2 != 0) {
			answer = answer - minNum * 2;
		}
		System.out.println(answer);

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] A = new int[2*10^5];
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for(int i = 0;i<N-1;i++) {
			int number = scn.nextInt();
			for(int j = 1;j<N+1;j++) {
				if(number == j) {
					A[j] += 1;
				}
			}
		}
		for(int i = 1;i<N+1;i++) {
			System.out.println(A[i]);
		}

	}

}

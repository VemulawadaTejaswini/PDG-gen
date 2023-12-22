
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int index = 0;
		int sum = 0;
		boolean[] A = new boolean[(int)Math.pow(10, 9)];
		for(int i = 0; i < N; i++) {
			index = scan.nextInt() - 1;
			if(A[index]) {
				A[index] = false;
			} else {
				A[index] = true;
			}
		}
		for(int i = 0; i < A.length; i++) {
			if(A[i]) {
				sum++;
			}
		}
		System.out.println(sum);
		scan.close();

	}

}

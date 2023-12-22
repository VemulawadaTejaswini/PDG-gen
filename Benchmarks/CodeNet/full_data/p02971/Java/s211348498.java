import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
			if(A[i] > max) {
				max = A[i];
				index = i;
			}
		}
		
		Arrays.sort(A);
		int max2 = A[N-2];
		
		for(int i = 0; i < N; i++) {
			if(i == index) {
				System.out.println(max2);
			}
			else {
				System.out.println(max);
			}
		}

	}

}
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		Arrays.sort(A);
		if(N % 2 == 1) {
			if(A[0] == 0) {
				for(int i = 1; i < N; i += 2) {
					if(A[i] == i + 1 && A[i + 1] == i + 1) {
						
					} else {
						count = -1;
						break;
					}
				}
			} else {
				count = -1;
			}
		} else if(N % 2 == 0) {
			for(int i = 0; i < N; i += 2) {
				if(A[i] == i + 1 && A[i + 1] == i + 1) {
					
				} else {
					count = -1;
					break;
				}
			}
		}
		
		if(count == -1) {
			System.out.println(0);
		} else {
			System.out.println(BigInteger.valueOf(((int)Math.pow(2, N / 2))).mod(BigInteger.valueOf(((int)Math.pow(10, 9) + 7))));
		}
		scan.close();
	}

}

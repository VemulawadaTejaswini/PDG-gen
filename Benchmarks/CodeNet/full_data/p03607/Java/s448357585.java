import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			if(A[i] != A[i - 1]) {
				int count = 0;
				for(int j = i; j <= N; j++) {
					if(A[i] == A[j]) {
						count++;
					} else {
						break;
					}
				}
				if(count % 2 != 0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}

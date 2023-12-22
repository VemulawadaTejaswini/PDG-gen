import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int[N];
		int B [] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		boolean x = false;
		for(int i = 0; i < N; i++) {
			if(A[i] > B[i]) {
				x = false;
				break;
			}	
			else {
				for(int j = 0; j < N-1; j++) {
					if(A[j+1] <= B[j]) {
						x = true;
						break;
					}
				}
			}
		}
		if(x == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
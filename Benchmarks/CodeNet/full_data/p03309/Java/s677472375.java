import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] ans = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int j=0; j<N; j++) {
			for (int k=0; k<N; k++){
				ans[j] += Math.abs(A[k]-(A[j]+1));
			}
		}Arrays.sort(ans);
		
		System.out.println(ans[0]);

	}

}

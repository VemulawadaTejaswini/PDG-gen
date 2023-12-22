import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long H[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			H[i] = sc.nextLong();			
		}
		Arrays.sort(H);
		long S = 0;
		for(int i = 0 ; i < Math.max(0, N - K) ; ++i){
			S += H[i];
		}
		System.out.println(S);
	}
}

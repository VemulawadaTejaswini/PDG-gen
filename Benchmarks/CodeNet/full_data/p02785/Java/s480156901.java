import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] H = new long[N];
		long ans = 0;
		for(int i = 0;i < N;i++){
			H[i] = sc.nextLong();
		}
		Arrays.sort(H);
		for(int i = 0;i < K;i++){
			H[N - 1 - i] = 0;
			if(N - 1 - i == 0){
				break;
			}
		}
		for(int i = 0;i < N;i++){
			ans += H[i];
		}
		System.out.println(ans);
	}
}
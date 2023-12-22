import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[300001];
		for(int i = 0 ; i < N ; ++i){
			int ai = sc.nextInt();
			A[ai]++;
		}
		N = A.length - 1;
		for(int i = 1 ; i < A.length ; ++i){
			A[i] = 1;
		}
		int freq[] = new int[300001];
		for(int a : A){
			if(a == 0){
				continue;
			}
			freq[a]++;
		}
		long C[] = new long[N + 1];
		long D[] = new long[N + 1];
		for(int f = 1 ; f <= N ; ++f){
			C[f] = C[f - 1] + f * freq[f];
			D[f] = D[f - 1] + freq[f];
		}
		int X[] = new int[N  + 1];
		for(int x = 1 ; x <= N ; ++x){
			long f = C[x] + x * (D[N] - D[x]);
			f = f / x;
			X[x] = (int)f;
		}
//		System.out.println(Arrays.toString(X));
		int res[] = new int[N + 1];
		res[1] = N;
		for(int i = N - 1 ; i >= 1 ; --i){
			if(X[i + 1] != X[i]){
				for(int j = X[i + 1] + 1; j <= X[i] ; ++j){
					res[j] = i;
				}
			}
		}
		for(int k = 1 ; k <= N ; ++k){
			System.out.println(res[k]);
		}
	}
}

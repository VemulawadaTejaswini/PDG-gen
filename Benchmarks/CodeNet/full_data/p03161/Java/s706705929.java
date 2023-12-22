import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = s.nextInt();
		}
		
		int[] result = new int[N];
		result[0] = 0;
		for(int i = 1; i < N; i++) {
			result[i] = result[i - 1] + Math.abs(H[i] - H[i - 1]);
		}
		for(int n = 0; n < N; n++) {
			for(int k = 1; k < K + 1; k++) {
				if(n + k >= N)
					continue;
				result[k + n] = Math.min(result[n] + Math.abs(H[n] - H[n + k]), result[k + n]);
			}
		}
		System.out.println(result[N-1]);
    }
}
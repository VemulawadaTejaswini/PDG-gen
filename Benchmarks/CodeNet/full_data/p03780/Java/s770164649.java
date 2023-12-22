import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc056.contest.atcoder.jp/tasks/arc070_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		
		Arrays.sort(a);
		long c=0;
		long ans = N;
		for(int i=N-1; i>=0; i--){
			if(a[i]>=K) continue;
			if(c+a[i]<K){
				c +=a[i];
			}else{
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);

	}

}
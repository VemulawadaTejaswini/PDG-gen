import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		Long[] h = new Long[N];
		for(int i =0;i<N;i++) {
			h[i]=scan.nextLong();
		}

		Arrays.sort(h);

		Long result = h[N-1]+1;

		//N=5, K=3のとき比較対象はh[0]とh[2]、比較終了はh[3]とh[5]
		//N=n, K=kのとき比較対象はh[i]とh[i+k-1]、比較終了はh[n-k+1]とh[n]

		for(int i=0;i<N-K+1;i++) {
			if(h[i+K-1]-h[i]<result) {
				result=h[i+K-1]-h[i];
			}
		}
		System.out.println(result);

	}
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new ABC107().doIt();
//		new ABC108().doIt(); //Math
//		new ABC109().doIt(); //LCM
	}
	class ABC107{
		void doIt() {
			int N = sc.nextInt();
			int K = sc.nextInt() - 1;
			long x[] = new long[N];
			long ans = Integer.MAX_VALUE;
			for(int i = 0;i < N ;i++)x[i] = sc.nextLong();
			for(int i = 0;i < N - K;i++) {
				long dist = Math.abs(x[i] - x[i + K]);
				if(x[i + K] < 0)dist = dist + Math.abs(0 - x[i + K]);
				else if(x[i] > 0)dist = dist + Math.abs(0 - x[i]);
				else dist = dist + Math.min(Math.abs(x[i]),x[i+K]);
				ans = Math.min(ans, dist);
			}
			System.out.println(ans);
		}
	}
	class ABC108{
		void doIt() {
			int N = sc.nextInt();
			int K = sc.nextInt();
			long A = 0;
			long A_2 = 0;
			for(int i = 1;i <= N;i++) {
				if(i % K == 0)A++;
				else if(i*2 % K == 0)A_2++;
			}
			long ans = A*A*A + A_2*A_2*A_2;
			System.out.println(ans);
		}
	}
	class ABC109{
		int euqulid(int A,int B) {
			if(B > 0)return euqulid(B,A % B);
			else return A;
		}
		void doIt(){
			int n = sc.nextInt();
			int X = sc.nextInt();
			int ans = Integer.MAX_VALUE;
			for(int i = 0;i < n;i++) {
				int x = sc.nextInt();
				int dist = Math.abs(x - X);
				if(i == 0)ans = dist;
				else ans = euqulid(dist,ans);
			}
			System.out.println(ans);
		}
	}
}

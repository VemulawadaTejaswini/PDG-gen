import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int[] count = new int[N+1];
		for(int i=0; i<=N; i++){
			count[i] = 0;
		}
		for(int i=0; i<M; i++){
			A[i]  = sc.nextInt();
			B[i]  = sc.nextInt();
			count[A[i]]++;
			count[B[i]]++;
		}
		int[][] dp = new int[N+1][];
		for(int i=0; i<=N; i++){
			dp[i] = new int[count[i]];			
		}
		for(int i=0; i<=N; i++){
			count[i] = 0;
		}
		for(int i=0; i<M; i++){
			dp[A[i]][count[A[i]]] = B[i];
			dp[B[i]][count[B[i]]] = A[i];
			count[A[i]]++;
			count[B[i]]++;
		}
 
		int[] ans = new int[2*N];
		ans[N] = A[0];
		int min = N;
		int max = N;
		boolean[] v = new boolean[N+1];
		for(int i=1;i<=N; i++){
			v[i] = true;
		}
		v[ans[N]] = false;
		boolean update = true;
		while(true){
			update = false;
			for(int i=0; i<count[ans[max]]; i++){
				if(v[dp[ans[max]][i]]==true){
					ans[max+1] = dp[ans[max]][i];
					v[dp[ans[max]][i]] = false;
					max++;
					update = true;
					break;
				}
			}
			for(int i=0; i<count[ans[min]]; i++){
				if(v[dp[ans[min]][i]]==true){
					ans[min-1] = dp[ans[min]][i];
					v[dp[ans[min]][i]] = false;
					min--;
					update = true;
					break;
				}
			}
			if(update==false){
				break;
			}
		}
 
		System.out.println(max-min+1);
		for(int j=min; j<max; j++){
			System.out.print(ans[j] + " ");
		}
		System.out.print(ans[max]);
 
	}
 
}
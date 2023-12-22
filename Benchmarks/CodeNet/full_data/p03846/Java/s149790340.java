import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N  = sc.nextInt();
			int[] A = new int[N+1];
			for(int i = 1 ; i <= N ; i++){
				A[i] = sc.nextInt();
				//System.out.println(A[i]);
			}
		sc.close();

		int[] check = new int[N+1];
		int[] right = new int[N+1];

		if(N%2!=0){
			right[0] = -1;
		}
		for(int i = N-1 ; i >= 0 ; i-=2){
			right[i]+=2;
		}

		for(int i = 1 ; i <= N ; i++){
			int p = A[i];
			check[p]++;
		}
		boolean T = true;

		for(int i = 0 ; i <= N ; i++){
			if(right[i]!=check[i]){
				T = false;
				break;
			}
		}
		long ans = 1;
		long inf = 1000000007;
		if(!T){
			System.out.println(0);
		}
		else{
			ans = (long)Math.pow(2, N/2)%inf;
			System.out.println(ans);
		}
	}
}
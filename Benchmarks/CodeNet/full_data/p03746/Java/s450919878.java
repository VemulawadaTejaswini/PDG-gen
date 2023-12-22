import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<M; i++){
			A[i]  = sc.nextInt();
			B[i]  = sc.nextInt();
		}

		int[] ans = new int[2*N];
		ans[N] = A[0];
		int min = N;
		int max = N;
		int pre;
		boolean[] v = new boolean[N+1];
		for(int i=1;i<=N; i++){
			v[i] = true;
		}
		v[ans[N]] = false;
		while(max!=2*N-1){
			pre = max;
			for(int i=0; i<M; i++){
				if(A[i]==ans[max]&&v[B[i]]==true){
					ans[max+1] = B[i];
					v[B[i]] = false;
					max++;
					break;
				}else if(B[i]==ans[max]&&v[A[i]]==true){
					ans[max+1] = A[i];
					v[A[i]] = false;
					max++;
					break;
				}
			}
			if(pre==max){
				break;
			}
		}
		while(min!=2){
			pre = min;
			for(int i=0; i<M; i++){
				if(A[i]==ans[min]&&v[B[i]]==true){
					ans[min-1] = B[i];
					v[B[i]] = false;
					min--;
					break;
				}else if(B[i]==ans[min]&&v[A[i]]==true){
					ans[min-1] = A[i];
					v[A[i]] = false;			
					min--;
					break;
				}
			}
			if(pre==min){
				break;
			}
		}

		System.out.println(max-min+1);
		for(int i=min; i<max; i++){
			System.out.print(ans[i] + " ");
		}
		System.out.print(ans[max]);

	}

}

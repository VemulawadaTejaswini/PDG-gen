import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N-1];
		int[] b = new int[N-1];
		int[] cnt = new int[N+1];
		for(int i=1; i<=N; i++){
			cnt[i] = 0;
		}
		for(int i=0; i<N-1; i++){
			a[i]  = sc.nextInt();
			b[i]  = sc.nextInt();
			cnt[a[i]]++;
			cnt[b[i]]++;
		}

		int[] next_leaf = new int[N+1]; 
		for(int i=1; i<=N; i++){
			next_leaf[i] = 0;
		}
		for(int i=0; i<N-1; i++){
			if(cnt[a[i]]==1){
				next_leaf[b[i]]++;
			}
			if(cnt[b[i]]==1){
				next_leaf[a[i]]++;
			}
		}

		boolean ans = false;
		for(int i=1; i<=N; i++){
			if(next_leaf[i]>=2){
				ans = true;
				break;
			}
		}

		if(ans==true){
			System.out.print("First");
		}else{
			System.out.print("Second");
		}

	}

}

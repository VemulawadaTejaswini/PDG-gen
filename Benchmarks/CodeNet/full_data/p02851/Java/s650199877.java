import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int K;
	int A[];
	int pre[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) A[i] = sc.nextInt();

		pre=new int[N];

		//前準備
		pre[0]=A[0] % K;
		for(int i=1; i<N; i++){
			pre[i] = (pre[i-1]+A[i]) % K;
		}
		int ans = 0;
		for(int w=1; w<=K; w++) {
			int sum = pre[w-1];
			if(sum == w) {
				ans++;
			}
			for(int i=0; i+w<N; i++) {
				sum = (((sum + (A[i+w] - A[i])) % K) + K) % K;
				if(sum == w) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}


}

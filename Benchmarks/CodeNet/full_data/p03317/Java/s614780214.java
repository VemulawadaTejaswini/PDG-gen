import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		int index = 0;
		int ans = 0;

		for(int i = 0; i < N;i++){
			a[i] = sc.nextInt();
			if(a[i] == 1)
				index = i + 1;
		}

		if(N<=K){
			ans = 1;
		}else{
			ans = (int)((index-1) / (K-1));
			if(((index-1) % (K-1)) > 0)
				ans++;

			ans += (int)((N-index) / (K -1));
			if(((N-index)%(K-1)) > 0)
				ans++;

		}

		System.out.println(ans);
	}
}

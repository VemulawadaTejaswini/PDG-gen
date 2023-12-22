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
			
			for(int i = index - 1;i>0;){
				ans++;
				i = i - (K-1);
			}

			for(int i = N - index;i>0;){
				ans++;
				i = i - (K-1);
			}
		}

		System.out.println(ans);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		long cnt1 = 0;
		long cnt2 = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(a[i] > a[j]){
					if(i<j){
						cnt2++;
						cnt1++;
					}
					else{
						cnt1++;
					}
				}
			}
		}
		long ans = cnt2 * (k);;
		ans %= 1000000007;



		for(;k > 0; k--){
			ans += (cnt1) * (k-1);
			ans %= 1000000007;
		}

		System.out.println(ans);

	}
}
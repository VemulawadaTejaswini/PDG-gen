import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long sum = 0;

		if (n%2==0) {
			for (int i = 1;i<n/2 ;i++ ) {
				sum += combiL(n,i)%(100000000+7);
			}
			sum = sum*2 +1+combiL(n,n/2);
			for (int i = 1;i<=n ;i++ ) {
				if (i==a||i==b) {
					sum -= combiL(n,i)%(100000000+7);
				}
			}
			System.out.println(sum);
		}else{
			for (int i = 1;i<=n/2 ;i++ ) {
				sum += combiL(n,i)%(100000000+7);
			}
			sum = sum*2 +1;
			for (int i = 1;i<=n ;i++ ) {
				if (i==a||i==b) {
					sum -= combiL(n,i)%(100000000+7);
				}
			}
			System.out.println(sum);
		}

	}
	public static int combiL(int n, int r){
		int ans = n;

		for(int i = 1;i<r;i++){
			ans = ans*(n-i)/(i+1);//(ans*(n-i+1))/(i);
		}
		return ans;
	}
}

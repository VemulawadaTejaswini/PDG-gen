import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			t[i] = sc.nextLong();
		}
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		sc.close();
		
		long ans = 1;
		int pos = -1;
		long top = 0;
		
		if(n==1){
			System.out.println("1");
			return;
		}
		
		for(int i=0; i<n; i++){
			if(a[i] == t[i]){
				pos = i;
				top = t[i];
				break;
			}
		}
		
		if(pos<0){
			System.out.println("0");
			return;
		}
		
		for(int i=pos; i<n; i++){
			if(t[i] > top){
				System.out.println("0");
				return;
			}
		}
		for(int i=pos; i>=0; i--){
			if(a[i] > top){
				System.out.println("0");
				return;
			}
		}
		
		for(int i=1; i<pos; i++){
			if(t[i] < t[i-1]){
				System.out.println("0");
				return;
			}else if(t[i] == t[i-1]){
				ans *= t[i];
				if(ans >= 1000000007){
					ans %= 1000000007;
				}
			}
		}
		
		
		for(int i=n-2; i>pos; i--){
			if(a[i] < a[i+1]){
				System.out.println("0");
				return;
			}else if(a[i] == a[i+1]){
				ans *= a[i];
				if(ans >= 1000000007){
					ans %= 1000000007;
				}
			}
		}
		
		System.out.println(ans);
	}

}
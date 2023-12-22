import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		long[] num = new long[50];
		num[0] = 2;
		num[1] = 5;
		for(int i=2; i<50; i++){
			num[i] = ((num[i-1] + num[i-2]) * 2) % 1000000007;
		}
		long ans = 0;
		boolean first = true;
		for(int i=30; i>=0; i--){
			long a = 1;
			for(int j=0; j<i; j++){
				a *= 2;
			}
			if(n / a != 0){
				n -= a;
				if(first){
				ans += num[i];
				first = false;
				}else{
					ans -= num[i];
				}
			}
			if(ans >= 1000000007){
				ans %= 1000000007;
			}
		}
		System.out.println(ans);
		
	}

}
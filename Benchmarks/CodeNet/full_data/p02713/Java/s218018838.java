import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				for(int k =1;k<=n;k++) {
					ans +=gcd(gcd (i,j),k);
				}
			}
		}
		System.out.println(ans);

	}
	public static int gcd(int a,int b) {
		
		if(b==0) {
			return a;
		}
		return gcd (b,a%b);
	}
	

}

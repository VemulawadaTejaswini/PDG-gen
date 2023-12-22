
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		int ans = 0;
		
		for(int i = 1 ; i <= k ;i++) {
			for(int j = 1 ; j <= k ; j++) {
				for(int l = 1 ; l <= k ; l++) {
					int temp = gcd(i,j);
					ans += gcd(temp,l);
				}
			}
		}
		
		System.out.println(ans);


	}
	
	static int gcd(int a , int b) {
		if(a < b) {
			return gcd(b,a);
		}
		int temp = 0 ;
		
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a != 0 || b != 0) {
		while (a % b != 0){
			temp = a;
			a = b;
			b = temp % b;
		}
		}
		return b;
	}
		
		
	}



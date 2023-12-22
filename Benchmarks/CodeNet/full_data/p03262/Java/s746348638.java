import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int X = sc.nextInt();
		
		int []x = new int [n];
		int []y = new int [n];
		
		for(int i = 0; i < n ; i++) {
			x[i] = sc.nextInt();
			y[i] = Math.abs(x[i] - X);
		}
		Arrays.sort(y);
		int ans = y[n-1];
		
		for(int i = 0; i < n-1 ; i++) {
			ans = Math.min(ans, gcd(y[i],y[i + 1]));
		}
		System.out.println(ans);

	}
	private static int gcd(int a, int  b) {
		int  temp = 0;

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



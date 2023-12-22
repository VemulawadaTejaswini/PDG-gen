import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int[] arr = new int[n];
		int[] gcdleft = new int[n];
		int[] gcdright = new int[n];		
		for(int i = 0; i < n; i++){
			arr[i] = seer.nextInt();
		}
		int g = 0;
		for(int i = 0; i < n; i++){
			gcdleft[i] = gcd(g, arr[i]);
			g = gcdleft[i];
		}
		g = 0;
		for(int i = n-1; i >= 0; i--){
			gcdright[i] = gcd(g, arr[i]);
			g = gcdright[i];
		}
		int maxgcd = 0;
		for(int i = 0; i < n; i++){
			int currg = gcd(i==0?0:gcdleft[i-1], i==n-1?0:gcdright[i+1]);
			maxgcd = Integer.max(maxgcd, currg);
		}
		System.out.println(maxgcd);
	}
	static int gcd(int a, int b){
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
}

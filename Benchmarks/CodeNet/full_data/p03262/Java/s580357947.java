import java.util.Scanner;
public class Main{
	//最大公約数gcd
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //都市の数
		int X = stdIn.nextInt(); //今いる座標
		int [] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = stdIn.nextInt();
		}
		int min = Integer.MAX_VALUE;
		if(n==1) {
			System.out.println(Math.abs(x[0]-X));
			System.exit(0);
		}
		
		for(int i = 0; i < n-1; i++) {
			min = Math.min(gcd(Math.abs(x[i]-X),Math.abs(x[i+1]-X)), min);
		}
		
		System.out.println(min);
		
		
		
		
		
	}

}

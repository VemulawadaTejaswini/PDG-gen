import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int K = io.nextInt();
		int g = io.nextInt();
		int max = g;
		
		for (int i = 2; i <= N; i++){
			int num = io.nextInt();
			max = Math.max(max,num);
			g = gcd(g,num);
		}
		
		System.out.println((K%g==0 && K<=max)? "POSSIBLE":"IMPOSSIBLE");
		
	}
	
	private int gcd(int a,int b){
		if(a%b==0) return b;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
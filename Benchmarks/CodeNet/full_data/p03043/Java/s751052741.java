import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		
		double total = 0;
		for(int i=N; i>=1; i--) {
			total += Math.pow(0.5,countHead(i,K));
		}
		System.out.println(total/N);
	}
	
	private int countHead(int start, int target) {
		int count = 0;
		while(target > start) {
			start = start*2;
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

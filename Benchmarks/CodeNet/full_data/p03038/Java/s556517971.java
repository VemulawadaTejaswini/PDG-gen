import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private void solve() {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		Operation[] operations = new Operation[N+M];
		for(int i=0;i<N;i++) {
			int A = in.nextInt();
			operations[i] = new Operation(1,A);
		}
		for(int j=N;j<N+M;j++) {
			int B = in.nextInt();
			int C = in.nextInt();
			operations[j] = new Operation(B,C);
		}
		Arrays.sort(operations);
		long ans = 0;
		int card_num = N;
		int k = 0;
		while(card_num>0) {
			if(operations[k].B > card_num) operations[k].B = card_num;
			ans += 1.0 * operations[k].C * operations[k].B;
			card_num -= operations[k].B;
			k++;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	public class Operation implements Comparable<Operation>{
		public int B;
		public int C;
		
		public Operation(int B, int C) {
			this.B = B;
			this.C = C;
		}
		
		@Override
		public int compareTo(Operation other) {
			return -Integer.compare(C, other.C);
		}
	}
}
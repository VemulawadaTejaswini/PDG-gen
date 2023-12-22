import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public void read() {
	}
	
	public void prepare() {
		
	}
	
	public long solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] types = new int[M+1];
		Arrays.fill(types, 0);
		
		for (int i=0; i<N; i++) {
			int K = in.nextInt();
			for (int j=0; j<K; j++) {
				int t = in.nextInt();
				types[t]++;
			}
		}
		
		in.close();

		int count = 0;
		for (int i=0; i<M+1; i++) {
			if (types[i] >= N) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.read();
		main.prepare();
		System.out.println(main.solve());
	}
}
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		String S = next();
		long K = nextLong();
		int N = S.length();
		char[] C = S.toCharArray();

		if(N == 1) {
			out.println(K/2);
			return;
		}

		List<Integer> cntList = new ArrayList<Integer>();
		long sum = 0;
		int cnt = 1;
		for(int i=1;i<N;i++) {
			if(C[i-1] == C[i]){
				cnt++;
				if(cnt % 2 == 0) {
					sum++;
				}
				if(i == N-1)cntList.add(cnt);
			}else if(C[i-1] != C[i]) {
				cntList.add(cnt);
				cnt = 1;
			}
		}

		boolean f = false;
		if(K >= 2) {
			if(C[0]==C[N-1]) {
				int a = cntList.get(0);
				int b = cntList.get(cntList.size()-1);
				if(a % 2 == 1 && b % 2 == 1) {
					f = true;
				}
			}
		}

		if(f) sum++;
		sum *= K;
		if(f) sum--;
		if(f&&cntList.size()==1)sum--;
		out.println(sum);
	}


	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}
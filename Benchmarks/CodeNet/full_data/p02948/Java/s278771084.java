import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
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
		int N = nextInt();
		int M = nextInt();

		int[][] AB = new int[N][2];
		for(int i=0;i<N;i++) {
			AB[i] = nextIntArray(2);
		}
		Arrays.sort(AB,(a1,a2)->Integer.compare(a2[1],a1[1]));
		Arrays.sort(AB,(a1,a2)->Integer.compare(a1[0],a2[0]));

		List<Integer> list = new LinkedList<Integer>();
		long sum = 0;
		int AB_i = 0;
		for(int l=1;l<=M;l++) {
			int Search_l = -1;
			while(AB_i<N&&AB[AB_i][0]==l) {
				int Insert_i = Search(list ,AB[AB_i][1],Search_l);
				if(M<Insert_i)break;// 候補外となるため挿入する必要なし
				list.add(Insert_i,AB[AB_i][1]);
				AB_i++;
				Search_l = Insert_i;
			}

			if(list.size()>0) {
				sum+=list.get(0);
				list.remove(0);
			}

			if(list.size()>M) {
				while(list.remove((Integer)1000)){}
			}
		}

		out.println(sum);
	}

	//二部探索
	static int Search(List<Integer> list, int k, int Search_l) {
		int l = Search_l;
		int r = list.size();
		while(r - l > 1) {
			int mid = (r + l) / 2;
			if(list.get(mid) <= k) r = mid;
			else l = mid;
		}
		return r;
	}


	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
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
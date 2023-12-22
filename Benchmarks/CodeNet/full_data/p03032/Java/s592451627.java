import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] values = new int[N];
		for(int i=0; i<N; i++) {
			values[i] = in.nextInt();
		}
		
		ArrayList<Integer> minus;
		long max = Long.MIN_VALUE;
		for(int l=0; l<=K; l++) {
			for(int r=0; r<=Math.min(K-l,N-l); r++) {
				long point = 0;
				minus = new ArrayList<>();
				for(int li=0; li<l; li++) {
					point += values[li];
					if(values[li]<0) minus.add(values[li]);
				}
				for(int ri=0; ri<r; ri++) {
					point += values[N-1-ri];
					if(values[N-1-ri]<0) minus.add(values[N-1-ri]);
				}
				minus.sort((i,j)->Integer.compare(i, j));
				for(int back=0; back<K-(l+r); back++) {
					if(minus.size()<=back) break;
					point -= minus.get(back);
				}
				max = Math.max(max, point);
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
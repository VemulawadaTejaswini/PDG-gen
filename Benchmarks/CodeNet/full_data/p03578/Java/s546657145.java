import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashMap<Integer,Integer> D = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int d = in.nextInt();
			if(D.containsKey(d)){
				D.put(d, D.get(d)+1);
			}else{
				D.put(d, 1);
			}
		}
		int M = in.nextInt();
		for (int i = 0; i < M; i++) {
			int t = in.nextInt();
			if(!D.containsKey(t)){
				System.out.println("NO");
				return;
			}else{
				int count = D.get(t);
				if(count == 1){
					D.remove(t);
				}else{
					D.put(t, count - 1);
				}
			}
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
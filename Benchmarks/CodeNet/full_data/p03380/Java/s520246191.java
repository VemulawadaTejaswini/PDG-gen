
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<n; i++) a.add(sc.nextInt());
		Collections.sort(a);
		int N = a.get(n-1);
		int K = 0;
		int max = 0;
		for(int i=0; i<n-1; i++) {
			int v=a.get(i);
			int tmp = Math.min(v, N-v);
			if(max < tmp) {
				max = tmp;
				K = v;
			}
		}
		System.out.println(N+" "+K);
		sc.close();
	}


}

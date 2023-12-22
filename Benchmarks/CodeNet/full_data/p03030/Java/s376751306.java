import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Restrant[] rests = new Restrant[N];
		for(int i=0; i<N; i++) {
			rests[i] = new Restrant(i+1, in.next(), in.nextInt());
		}
		Arrays.sort(rests);
		for(Restrant r : rests) {
			System.out.println(r.id);
		}
	}
	
	public class Restrant implements Comparable<Restrant>{
		int id;
		String city;
		int score;
		
		public Restrant(int id, String city, int score) {
			this.id = id;
			this.city = city;
			this.score = score;
		}

		@Override
		public int compareTo(Restrant other) {
			int order = city.compareTo(other.city);
			if(order==0) {
				order = -Integer.compare(score, other.score);
			}
			return order;
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}

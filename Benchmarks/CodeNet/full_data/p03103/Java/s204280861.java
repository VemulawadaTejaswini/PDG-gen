import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair implements Comparable<Pair>{
		long a;
		long b;
		Pair(int a, int b){
			this.a=a;
			this.b=b;
		}
		@Override
		public int compareTo(Pair arg0) {
			return Long.compare(this.a, arg0.a);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Pair> ab = new ArrayList<Pair>();
		for(int i=0; i<n; i++) {
			ab.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(ab);
		long ans = 0;
		for(int i=0; i<n; i++) {
			if(m<=0) {
				break;
			}
			Pair p = ab.get(i);
			long a = p.a;
			long b = Math.min(p.b, m);
			ans += a * b;
			m -= b;
		}
		System.out.println(ans);
		sc.close();
	}

}

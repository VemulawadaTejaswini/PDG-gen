import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair implements Comparable<Pair>{
		int x;
		int y;
		Pair(int x, int y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(Pair o) {
			return Integer.compare(this.y, o.y);
		}

	}
	public void run() {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		long sum = 0;
		for(int i=0; i<N; i++) {
			A.add(sc.nextInt());
			sum += A.get(i);
		}

		ArrayList<Pair> BC = new ArrayList<>();
		for(int i=0; i<M; i++) {
			int b=sc.nextInt();
			int c=sc.nextInt();
			Pair p = new Pair(b,c);
			BC.add(p);
		}

		Collections.sort(A);
		Collections.sort(BC, Collections.reverseOrder());

		ArrayList<Integer> D = new ArrayList<>();
		for(int i=0; i<BC.size(); i++) {
			Pair p = BC.get(i);
			for(int j=0; j<p.x; j++) {
				D.add(p.y);
				if(D.size()>=N) {
					break;
				}
			}
		}

		int j=0;
		for(int i=0; i<D.size(); i++) {
			if(j<A.size() && A.get(j)<D.get(i)) {
				sum += D.get(i)-A.get(j);
				j++;
			}else {
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}

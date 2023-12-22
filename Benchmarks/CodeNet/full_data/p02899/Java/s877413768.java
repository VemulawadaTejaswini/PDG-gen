import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Pair> ps = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int w = sc.nextInt();
			ps.add(new Pair(i+1, w));
		}
		Collections.sort(ps);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(ps.get(i).n+" ");
		}
		System.out.println(sb.toString().trim());
	}
	static class Pair implements Comparable<Pair>{
		int n, w;
		public Pair(int _n, int _w) {
			 n = _n; w = _w;
		}
		@Override
		public int compareTo(Pair p) {
			return w-p.w;
		}
	}

}

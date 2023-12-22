import java.util.*;


public class Main {
	String s;
	
	class C implements Comparable<C> {
		int ind, step;

		public C(int ind, int step) {
			super();
			this.ind = ind;
			this.step = step;
		}

		@Override
		public int compareTo(C o) {
			String now = s.substring(this.ind, this.ind + this.step);
			String other = s.substring(o.ind, o.ind + o.step);
			return now.compareTo(other);
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = sc.next();
			int k = sc.nextInt();
			PriorityQueue<C> q = new PriorityQueue<>();
			
			HashSet<String> set = new HashSet<>();
			for(int i = 0; i < s.length(); i++){
				String now = s.substring(i, i+1);
				q.add(new C(i, 1));
			}
			int count = 1;
			while(!q.isEmpty()){
				C now = q.poll();
				String nows = s.substring(now.ind, now.ind + now.step);
				if(!set.contains(nows) && count == k){
					System.out.println(s.substring(now.ind, now.ind + now.step));
					break;
				}
				if(!set.contains(nows)){
					set.add(nows);
					count++;
				};
				if(now.ind + now.step + 1 > s.length()) continue;
				q.add(new C(now.ind, now.step+1));
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}

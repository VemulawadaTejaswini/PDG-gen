import java.util.*;

public class Main {
	
	class C implements Comparable<C>{
		public int a,b;
		
		public C(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(C o) {
			if(this.a < o.a) return -1;
			if(this.a > this.b)return 1;
			return 0;
		}

		@Override
		public String toString() {
			return "C [a=" + a + ", b=" + b + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			ArrayList<C> data = new ArrayList<>();
			for(int i =0 ; i < n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				C c = new C(a, b);
				data.add(c);
			}
			Collections.sort(data);
			
			long sum = 0;
			for(C c: data){
				sum += c.b;
				if(sum >= k){
					System.out.println(c.a);
					break;
				}
			}
//		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}

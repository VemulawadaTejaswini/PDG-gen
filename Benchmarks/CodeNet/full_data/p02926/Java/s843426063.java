import java.util.*;

public class Main {
	static class Engine {
		int x, y;

		public Engine(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Engine[] engine = new Engine[N];
		for(int i=0; i<N; i++) {
			engine[i] = new Engine(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(engine, new Comparator<Engine>() {
			public int compare(Engine e1, Engine e2) {
				if(e1.x==0) {
					if(e1.y>=0) {
						return -1;
					} else {
						return (e2.x==0 && e2.y>=0)||e2.x<0 ? 1 : -1;
					}
				}
				if(e2.x==0) {
					if(e2.y>=0) {
						return 1;
					} else {
						return (e1.x==0 && e1.y>=0)||e1.x<0 ? -1 : 1;
					}
				}
				if(e1.x<0 && e2.x>0) {
					return -1;
				}
				if(e1.x>0 && e2.x<0) {
					return 1;
				}
				return Long.compare((long)e2.x*e1.y, (long)e1.x*e2.y);
			}
		});
		
		double max = 0;
		for(int i=0; i<N; i++) {
			long x = 0;
			long y = 0;
			for(int j=0; j<N; j++) {
				x += engine[(i+j)%N].x;
				y += engine[(i+j)%N].y;
				max = Math.max(max, Math.sqrt(x*x+y*y));
			}
		}
		
		System.out.println(max);
		sc.close();
	}
	
}
package ABC130F;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	double inf = 1e10;
	class D{
		double l[] = new double[3];
		double r[] = new double[3];
		public D(){
			for(int i=0; i<3; i++) {
				l[i] = inf;
				r[i] = -inf;
			}
		}
		public void add(double x, int v) {
			v++;
			l[v] = Math.min(l[v], x);
			r[v] = Math.max(r[v], x);
		}

		public double get(double t) {
			double minl = inf;
			double maxr = -inf;
			for(int i=0; i<3; i++) {
				minl = Math.min(minl, l[i]+(t*i));
				maxr = Math.max(maxr, r[i]+(t*i));
			}
			return maxr-minl;
		}
		public ArrayList<Double> events() {
			ArrayList<Double> el = new ArrayList<>();
			for(int i=0; i<3; i++) {
				for(int j=0; j<i; j++) {
					double t = (l[j]-l[i])/(i-j);
					if(t>0) el.add(t);
					t = (r[j]-r[i])/(i-j);
					if(t>0) el.add(t);
				}
			}
			return el;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		D dx = new D();
		D dy = new D();
		for(int i=0; i<n; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
			char d = sc.next().charAt(0);
			if(d=='R') {dx.add(x, 1); dy.add(y, 0);}
			if(d=='L') {dx.add(x, -1); dy.add(y, 0);}
			if(d=='U') {dx.add(x, 0); dy.add(y, 1);}
			if(d=='D') {dx.add(x, 0); dy.add(y, -1);}
		}
		ArrayList<Double> nsl = new ArrayList<>();
		nsl.add(0.0);
		nsl.add(inf);
		nsl.addAll(dx.events());
		nsl.addAll(dy.events());
		Collections.sort(nsl);
		double min = inf;
		for(double t : nsl) {
			min = Math.min(min, dx.get(t) * dy.get(t));
		}
		System.out.println(String.format("%.10f", min));
		sc.close();
	}
}

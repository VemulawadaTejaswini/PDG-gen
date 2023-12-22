
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int h;
	int w;
	int d;
	int[] x;
	int[] y;
	void run() {

		h = sc.nextInt();
		w = sc.nextInt();
		d = sc.nextInt();

		x = new int[h * w + 1];
		y = new int[h * w + 1];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int k = sc.nextInt();
				x[k] = i;
				y[k] = j;
			}
		}

		m = new int[h * w + 1];
		int q = sc.nextInt();

		for(int i = 0 ; i< q; i++)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(query(l,r));
		}
	}

	int[] m;

	int query(int l,int r) {
		return search(r)- search(l) ;
	}
	
	int search(int target ){
		if(target - d<= 0 ){
			return 0;
		}
		if(m[target] != 0 ){
			return m[target];
		}
		
		int res;
		res = search(target - d);
		res += Math.abs(x[target] - x[target-d]);
		res += Math.abs(y[target] - y[target-d]);
		
		m[target] = res;
		return res;
	}
	
}
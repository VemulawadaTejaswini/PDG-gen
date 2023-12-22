import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Long []a,b,c;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		a = new Long[x];
		b = new Long[y];
		c = new Long[z];
		for(int i=0;i<x;i++)a[i]=Long.parseLong(sc.next());
		for(int i=0;i<y;i++)b[i]=Long.parseLong(sc.next());
		for(int i=0;i<z;i++)c[i]=Long.parseLong(sc.next());

		sc.close();

		Arrays.sort(a,Comparator.reverseOrder());
		Arrays.sort(b,Comparator.reverseOrder());
		Arrays.sort(c,Comparator.reverseOrder());
		List<Long> list = new ArrayList<Long>();

		if(x>K)x=K;
		if(y>K)y=K;
		if(z>K)z=K;


		long abs_a = a[0]-a[x-1];
		long abs_b = b[0]-b[y-1];
		long abs_c = c[0]-c[z-1];

		while(x*y*z>1000010) {
			if(abs_a > abs_b) {
				if(abs_a>abs_c) {
					x--;
					abs_a = a[0]-a[x-1];
				}else {
					z--;
					abs_c = c[0]-c[z-1];
				}
			}else {
				if(abs_b>abs_c) {
					y--;
					abs_b = b[0]-b[y-1];
				}else if(abs_b<abs_c){
					z--;
					abs_c = c[0]-c[z-1];
				}else if(abs_a == abs_b){
					if(x>0) {x--;abs_a = a[0]-a[x-1];}
					if(y>0) {y--;abs_b = b[0]-b[y-1];}
				}
			}
		}



		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					list.add(a[i]+b[j]+c[k]);
				}
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<K;i++) {
			System.out.println(list.get(i));
		}

	}

}

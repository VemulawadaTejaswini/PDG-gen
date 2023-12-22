import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		int n = nextInt();
		long[]a = new long [n];
		for(int i=0;i<n;i++)a[i]=nextLong();
		Arrays.sort(a);

		long min1 = a[0],min2 = a[1];
		long loop = min2;
		boolean badf = false;
		long res1=1,res2=1;

		while(loop>0) {
			badf = false;
			for(int i=n-1;0<i;i--) {
				if(a[i]%loop!=0) {
					badf=true;
					break;
				}
			}

			if(!badf) {
				res1 = loop;
				break;
			}
			loop--;
		}
		a[1]=a[0];
		loop = min1;
		while(loop>0) {
			badf = false;
			for(int i=n-1;0<i;i--) {
				if(a[i]%loop!=0) {
					badf=true;
					break;
				}
			}

			if(!badf) {
				res2 = loop;
				break;
			}
			loop--;
		}

		System.out.println(Math.max(res1,res2));
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
	private long nextLong() {
		return Long.parseLong(sc.next());
	}
	@SuppressWarnings("unused")
	private String next() {
		return sc.next();
	}

}
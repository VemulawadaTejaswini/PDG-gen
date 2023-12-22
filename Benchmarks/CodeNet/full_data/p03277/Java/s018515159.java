
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] base = new int[n];

		for (int i=0;i<n;i++) {
			base[i]=sc.nextInt();
		}

		System.out.println(bs(base,1,1000*1000*1000+1));


	}

	static int bs (int[] base, int min, int max) {
		if (min+1 == max) {
			return min;
		}

		int mid = min+(max-min)/2;
		int n = base.length;
		Bit bit = new Bit(2*n+1); // 0 to 2n
		int tmp = n;
		long tmp2 = 0;

		for (int i=0;i<n;i++) {
			bit.add(tmp,1);
			tmp+=(base[i]>=mid?1:-1);
			tmp2+=bit.sum(tmp+1);
		}

		if (tmp2*4 >= (long)n*(n+1)) {
			return bs(base, mid, max);
		} else {
			return bs(base, min, mid);
		}
	}
}

class Bit {
	//0-indexed
	int n;
	long[] values;
	public Bit(int n) {
		this.n=n;
		values = new long[n];
	}
	void add(int pos, int val) {
		for (int i=pos;i<n;i|=(i+1)) {
			values[i]+=val;
		}
	}
	long sum(int a) {
		int ans = 0;
		for (int i=a-1;i>=0;i=(i&(i+1))-1) {
			ans += values[i];
		}
		return ans;
	}
}

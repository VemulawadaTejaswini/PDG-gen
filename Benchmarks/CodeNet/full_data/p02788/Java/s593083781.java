
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		long a = sc.nextLong();
		List<Mon> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(new Mon(sc.nextLong(), (sc.nextLong() + a - 1) / a));
		}
		list.sort(Comparator.comparing(Mon::getX));
		long[] x = new long[n];
		long[] h = new long[n];
		for(int i = 0; i < n; i++) {
			x[i] = list.get(i).getX();
			h[i] = list.get(i).getH();
		}
		long ans = 0;
		int pos = 0;
		int l = pos;
		int r = n;
		while(l + 1 != r) {
			int mid = (l + r) / 2;
			if(x[pos] + 2 * d < x[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		while(pos < n) {
			while(l < n && x[pos] + 2 * d >= x[l]) {
				l++;
			}
			l--;
			long at = h[pos];
			for(int i = pos; i < l + 1; i++) {
				h[i] -= at;
			}
			while(pos < n && h[pos] <= 0) {
				pos++;
			}
			ans += at;
		}
		System.out.println(ans);
	}

}

class Mon {
	private long x;
	private long h;

	protected Mon(long x, long h) {
		super();
		this.x = x;
		this.h = h;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getH() {
		return h;
	}

	public void setH(long h) {
		this.h = h;
	}

}
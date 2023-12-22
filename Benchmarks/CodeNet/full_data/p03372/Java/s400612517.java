
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		List<Pair> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(new Pair(sc.nextLong(), sc.nextLong()));
		}
		long[] dis = new long[n];
		long[] clo = new long[n];
		list.sort(Comparator.comparing(Pair::getDis));
		for(int i = 0; i < n; i++) {
			Pair tmp = list.get(i);
			if(i == 0) {
				clo[i] = tmp.getClo();
			} else {
				clo[i] = clo[i - 1] + tmp.getClo();
			}
			dis[i] = tmp.getDis();
		}
		long ans = 0;
		long[] right = new long[n];
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				right[0] = Math.max(0, clo[i] - dis[i]);
			} else {
				right[i] = Math.max(right[i - 1], clo[i] - dis[i]);
			}
		}
		long[] left = new long[n];
		for(int i = n - 1; i > -1; i--) {
			long tmp = 0;
			if(i == 0) {
				tmp = clo[n - 1];
			} else {
				tmp = clo[n - 1] - clo[i - 1];
			}
			if(i == n - 1) {
				left[i] = Math.max(0, tmp - (c - dis[i]));
			} else {
				left[i] = Math.max(left[i + 1], tmp - (c - dis[i]));
			}
		}
		for(int i = 0; i < n + 1; i++) {
			long dismin = Long.MAX_VALUE;
			long tmp = 0;
			if(i == 0) {
				tmp = left[i];
			} else if(i == n) {
				tmp = right[i - 1];
			} else {
				tmp = right[i - 1] + left[i];
				dismin = Math.min(dis[i - 1], dis[i]);
				if(right[i - 1] != 0 && left[i] != 0) {
					tmp -= dismin;
				}
			}
			ans = Math.max(ans, tmp);
		}

		System.out.println(ans);
	}

}

class Pair {
	private long dis;
	private long clo;

	protected Pair(long dis, long clo) {
		super();
		this.dis = dis;
		this.clo = clo;
	}

	public long getDis() {
		return dis;
	}

	public void setDis(long dis) {
		this.dis = dis;
	}

	public long getClo() {
		return clo;
	}

	public void setClo(long clo) {
		this.clo = clo;
	}

}

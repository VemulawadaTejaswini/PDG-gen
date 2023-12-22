import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		ArrayList<Sa> as = new ArrayList<>(n);
		ArrayList<Sa> bs = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			as.add(new Sa(i, a[i]));
			bs.add(new Sa(i, b[i]));
		}
		Collections.sort(as, new SaComparator());
		Collections.sort(bs, new SaComparator());
		long takasum = 0;
		long aosum = 0;
		for (int i = 0; i < n; i++) {
			long asmax = as.get(as.size() - 1).sa;
			int asmaxkey = as.get(as.size() - 1).key;
			long bsmax = bs.get(bs.size() - 1).sa;
			int bsmaxkey = bs.get(bs.size() - 1).key;
			if (asmax > bsmax) {
				if (i % 2 == 0) {
					takasum += a[asmaxkey];
				} else {
					aosum += b[asmaxkey];
				}
				as.remove(as.size() - 1);
				bs.remove(new Sa(asmaxkey, b[asmaxkey]));
			} else {
				if (i % 2 == 0) {
					takasum += a[bsmaxkey];
				} else {
					aosum += b[bsmaxkey];
				}
				bs.remove(bs.size() - 1);
				as.remove(new Sa(bsmaxkey, a[bsmaxkey]));
			}
		}
		System.out.println(takasum - aosum);
	}
}

class Sa {
	public int key;
	public long sa;
	public Sa(int key, long sa) {
		this.key = key;
		this.sa = sa;
	}
}

class SaComparator implements Comparator<Sa> {
	@Override
	public int compare(Sa sa1, Sa sa2) {
		return (int) (sa1.sa - sa2.sa);
	}
}
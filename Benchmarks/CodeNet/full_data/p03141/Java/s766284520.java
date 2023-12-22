import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		ArrayList<Sa> sum = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			sum.add(new Sa(i, a[i] + b[i]));
		}
		Collections.sort(sum, new SaComparator());
		long takasum = 0;
		long aosum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				takasum += a[sum.get(n - 1 - i).key];
			} else {
				aosum += b[sum.get(n - 1 - i).key];
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
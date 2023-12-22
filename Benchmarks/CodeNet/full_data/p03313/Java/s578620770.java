
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1 << n;
		long[] a = new long[m];
		for (int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		long[][] max = new long[m][2];
		for (int i=0;i<m;i++) {
			TreeSet<Long> set = new TreeSet<Long>();
			set.add(a[i]*m+i);
			for (int j=0;j<n;j++) {
				if ((i>>j)%2!=0) {
					set.add(max[i-(1<<j)][0]);
					set.add(max[i-(1<<j)][1]);
				}
			}
			
			max[i][0]=set.last();
			if (set.size()>1) {
				max[i][1]=set.lower(set.last());
			}
		}

		long ans = 0;
		for (int i=1;i<m;i++) {
			ans = Math.max(ans, max[i][0]/m+max[i][1]/m);
			System.out.println(ans);
		}
	}

}

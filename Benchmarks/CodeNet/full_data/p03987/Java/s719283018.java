import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int p[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt()-1;
			p[a[i]] = i;
		}
		TreeSet<Integer> x = new TreeSet<Integer>();
		int l[] = new int[n];
		int r[] = new int[n];
		for(int i=0;i<n;i++) {
			x.add(p[i]);
			if(x.first()==p[i]) {
				l[i] =p[i]+1;
			}
			else {
				int lower = x.lower(p[i]);
				l[i] = p[i]-lower;
			}
			if(x.last()==p[i]) {
				r[i] = n-p[i];
			}
			else {
				int high = x.higher(p[i]);
				r[i] = high-p[i];
			}
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			ans+=(long) l[i]*r[i]*(i+1);
		}
		System.out.println(ans);
		
	}
}

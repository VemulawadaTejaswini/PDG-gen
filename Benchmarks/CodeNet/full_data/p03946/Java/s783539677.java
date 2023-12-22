import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int t=0, n=sc.nextInt(), k=sc.nextInt(), tot=k, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, diff=-1;
		boolean findDiff = false;
		while (n-->0) {
			int a = sc.nextInt();
			if (a<min) {
				min=a; max=Integer.MIN_VALUE; findDiff = false;
			} else if (a>max) {
				max=a; findDiff = true;
			}
			if (findDiff && diff>0 && max-min==diff) {
				if (tot>0) { t++; tot--; }
			}
			if (findDiff && max-min>diff) {
				diff=(max-min); t = 1; tot=k-1;
			}
		}
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}
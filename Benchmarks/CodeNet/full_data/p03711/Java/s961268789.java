import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,3,5,7,8,10,12};
		int[] b = {4,6,9,11};
		int[] c = {2};
		int d = sc.nextInt(), e = sc.nextInt();
		boolean ok = (Arrays.binarySearch(a,d)>=0 && Arrays.binarySearch(a,e)>=0)||
		(Arrays.binarySearch(b,d)>=0 && Arrays.binarySearch(b,e)>=0)||(Arrays.binarySearch(c,d)>=0 && Arrays.binarySearch(c,e)>=0); 
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}